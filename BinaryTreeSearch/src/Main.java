public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        System.out.println("In-order Traversal:");
        tree.inOrder(tree.root);
        // Output should be: 4 2 5 1 3 //
    }

}