package com.james.fennell.binarytreelabsolution;

// AVL Tree class that extends BinarySearchTree
public class AVLTree<T extends Comparable<T>> extends BinarySearchTree<T> {

    public Node<T> root;

    // Get the height of the node by calculating max(left height, right height)
    private int getHeight(Node<T> node) {
        if (node == null) {
            return 0; // Null node has height 0
        }
        // Height is the max height of left and right subtree plus 1
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }
    // Get the balance factor (difference in heights of left and right subtrees)
    private int getBalance(Node<T> node) {
        if (node == null) {
            return 0; // Null node is perfectly balanced
        }
        return getHeight(node.left) - getHeight(node.right);
    }
    // Right rotate (single rotation)
    private Node<T> rightRotate(Node<T> y) {
        Node<T> x = y.left;
        Node<T> T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Return new root
        return x;
    }

    // Left rotate (single rotation)
    private Node<T> leftRotate(Node<T> x) {
        Node<T> y = x.right;
        Node<T> T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Return new root
        return y;
    }
    public void insert(T data) {
        root = insertRec(root, data);
    }

    private Node<T> insertRec(Node<T> node, T data) {
        if (node == null) {
            return new Node<>(data);
        }

        // Standard BST insertion
        if (data.compareTo(node.data) < 0) {
            node.left = insertRec(node.left, data);
        } else if (data.compareTo(node.data) > 0) {
            node.right = insertRec(node.right, data);
        } else {
            return node; // No duplicates allowed
        }

        // Calculate balance factor
        int balance = getBalance(node);

        // Check balance and perform rotations if necessary

        // Left Left Case
        if (balance > 1 && data.compareTo(node.left.data) < 0) {
            return rightRotate(node);
        }

        // Right Right Case
        if (balance < -1 && data.compareTo(node.right.data) > 0) {
            return leftRotate(node);
        }

        // Left Right Case
        if (balance > 1 && data.compareTo(node.left.data) > 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && data.compareTo(node.right.data) < 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node; // Return the (unchanged) node pointer
    }

}
