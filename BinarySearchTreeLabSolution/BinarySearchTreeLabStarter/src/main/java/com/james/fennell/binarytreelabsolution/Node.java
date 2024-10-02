package com.james.fennell.binarytreelabsolution;

// Node class with left, right, and generic data
public class Node<T> {
    T data; // Generic data field
    Node<T> left, right; // Left and right child references

    // Constructor to initialize data and children
    public Node(T data) {
        this.data = data;
        left = right = null;
    }
}
