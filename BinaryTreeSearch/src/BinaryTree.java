import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.List;
public class BinaryTree {
    Node root;
    // Insert a new Node in the tree
    public void insert(int data) {
        // Your code here from lecture slides
        Node node = new Node(data);
        if (root == null) {
            root = node;
            return;
        }
        Queue<Node> list = new LinkedList<>();
        list.add(root);
        while (!list.isEmpty()) {
            Node current = list.poll();
            if(current.left == null) {
                current.left = node;
                break;
            } else{
                list.add(current.left);
            }
            if(current.right == null) {
                current.right = node;
            break;
            }
            else{
                list.add(current.right);
            }
        }

    }
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

    }
    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

}
