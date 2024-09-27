// BinarySearchTree class with generic type T
public class BinarySearchTree<T extends Comparable<T>> {
    Node<T> root; // Root of the binary search tree
    // Insert method based on the binary search tree property
    public void insert(T data) {
        root = insertRec(root, data);
    }
    // Recursive helper function for insertion
    private Node<T> insertRec(Node<T> root, T data) {
        // If the root is null, create and return a new node
        if (root == null) {
            return new Node<>(data);
        }
        // Compare the data with the current node's data
        if(data.compareTo(root.data) <0)
            root.left = insertRec(root.left, data);
        // If the data is less than the current node's data, recursively insert into the left child
        if(data.compareTo(root.data) > 0)
            root.right = insertRec(root.right, data);
        // If the data is greater, recursively insert into the right child
        // Finally, return the root
        return root;
    }

    // Add traversal methods for BinarySearchTree
// In-Order Traversal (left -> root -> right)
    public void inOrder(Node<T> root) {
        // Base case: If the node is null, return
        if (root != null) {
        inOrder(root.left);
        // First, recursively visit the left child
        // Then, print the current node's data
        System.out.println(root.data+ " ");
        // Finally, recursively visit the right child
        inOrder(root.right);
        }

    }
    // Pre-Order Traversal (root -> left -> right)
    public void preOrder(Node<T> root) {
        // Base case: If the node is null, return
        if (root != null) {
            // First, print the current node's data
            System.out.println(root.data + " ");
            // Then, recursively visit the left child
            preOrder(root.left);
            // Finally, recursively visit the right child
            preOrder(root.right);
        }
    }
    // Post-Order Traversal (left -> right -> root)
    public void postOrder(Node<T> root) {
        // Base case: If the node is null, return
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data+ " ");
        }
        // First, recursively visit the left child
        // Then, recursively visit the right child
        // Finally, print the current node's data
    }
}