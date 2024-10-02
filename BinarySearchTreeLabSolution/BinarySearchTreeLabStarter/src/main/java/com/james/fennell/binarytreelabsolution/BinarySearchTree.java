package com.james.fennell.binarytreelabsolution;

// BinarySearchTree class with generic type T
public class BinarySearchTree<T extends Comparable<T>> {

    Node<T> root; // Root of the binary search tree
    int comparisons; // To count the number of comparisons made

    // Insert method based on the binary search tree property
    public void insert(T data) {
        root = insertRec(root, data);
    }

    // Recursive helper function for insertion
    private Node<T> insertRec(Node<T> root, T data) {
        comparisons++;
        if (root == null) { // If the root is null, create and return a new node
            return new Node<>(data);
        }

        // Compare the data with the current node's data
        // If the data is less, insert into the left child
        if (data.compareTo(root.data) < 0) {
            root.left = insertRec(root.left, data);
        } // If the data is greater, insert into the right child
        else if (data.compareTo(root.data) > 0) {
            root.right = insertRec(root.right, data);
        }

        // Return the root after insertion
        return root;
    }

    // Add traversal methods for BinarySearchTree
// In-Order Traversal (left -> root -> right)
    public void inOrder(Node<T> root) {
        if (root != null) {
            inOrder(root.left); // Recursively visit the left child
            System.out.print(root.data + " "); // Print current node's data
            inOrder(root.right); // Recursively visit the right child
        }
    }

// Pre-Order Traversal (root -> left -> right)
    public void preOrder(Node<T> root) {
        if (root != null) {
            System.out.print(root.data + " "); // Print current node's data
            preOrder(root.left); // Recursively visit the left child
            preOrder(root.right); // Recursively visit the right child
        }
    }

// Post-Order Traversal (left -> right -> root)
    public void postOrder(Node<T> root) {
        if (root != null) {
            postOrder(root.left); // Recursively visit the left child
            postOrder(root.right); // Recursively visit the right child
            System.out.print(root.data + " "); // Print current node's data
        }
    }

    // Method to calculate the height of the binary search tree
    public int height(Node<T> root) {
        if (root == null) {
            return 0; // Base case: If the node is null, return 0
        }
        // Recursively calculate the height of the left and right subtrees
        // Return the maximum of the two heights, plus 1 to account for the current node
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // Reset the comparison counter
    public void resetComparisons() {
        comparisons = 0;
    }

    // Search method that counts the number of comparisons
    public boolean search(Node<T> root, T data) {
        comparisons++; // Increment the comparison counter
        if (root == null) {
            return false; // Data not found
        }
        if (root.data.equals(data)) {
            return true; // Data found
        }
        if (data.compareTo(root.data) < 0) {
            return search(root.left, data); // Search left subtree
        } else {
            return search(root.right, data); // Search right subtree
        }
    }

    // Method to return the current number of comparisons
    public int getComparisonCount() {
        return comparisons;
    }
}
