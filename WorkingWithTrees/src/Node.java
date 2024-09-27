public class Node<T> {
    T data;
    Node<T> left, right;
    // Constructor to initialize data and children
    public Node(T data) {
        this.data = data;
        left = right = null;
    }
}