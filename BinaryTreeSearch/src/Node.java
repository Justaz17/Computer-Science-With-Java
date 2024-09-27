public class Node {
    int data;
    Node left, right;
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
    public int height(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

}
