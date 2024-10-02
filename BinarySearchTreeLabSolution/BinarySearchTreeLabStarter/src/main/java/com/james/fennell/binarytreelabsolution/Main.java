package com.james.fennell.binarytreelabsolution;

public class Main {
    public static void main(String[] args) {
        // Create an instance of BinarySearchTree for Integer
        BinarySearchTree<Integer> intTree = new BinarySearchTree<>();
        AVLTree<Integer> avlTree = new AVLTree<>();
        // Insert several integer values into the tree
        intTree.insert(50);
        intTree.insert(30);
        intTree.insert(70);
        intTree.insert(20);
        intTree.insert(40);
        intTree.insert(60);
        intTree.insert(80);

        // Call inOrder traversal method to print the integers in sorted order
        System.out.println("In-order Traversal (Integers):");
        intTree.inOrder(intTree.root); // Output: 20 30 40 50 60 70 80

        // Create an instance of BinarySearchTree for Person
        BinarySearchTree<Person> personTree = new BinarySearchTree<>();
        // Insert several Person objects into the tree
        personTree.insert(new Person("Alice", 30));
        personTree.insert(new Person("Bob", 25));
        personTree.insert(new Person("Charlie", 35));
        personTree.insert(new Person("Dave", 32));
        personTree.insert(new Person("Edel", 27));
        personTree.insert(new Person("Francis", 37));
        personTree.insert(new Person("Greta", 34));
        personTree.insert(new Person("Harry", 29));
        personTree.insert(new Person("Iris", 36));

        // Call inOrder traversal method to print the Person objects in order by age
        System.out.println("\nIn-order Traversal (Persons by ID):");
        personTree.inOrder(personTree.root); // Output: Bob, Alice, Charlie (sorted by age)
        avlTree.insert(10);
        avlTree.insert(103);
        avlTree.insert(14);
        avlTree.insert(157);
        avlTree.insert(13);
        avlTree.insert(87);
        avlTree.insert(75);
        avlTree.insert(52);
        avlTree.insert(49);
        avlTree.insert(72);
        avlTree.insert(4);
        avlTree.insert(1);
        avlTree.insert(84);
        avlTree.insert(34);
        avlTree.insert(76);
        avlTree.insert(79);
        avlTree.insert(20);
        avlTree.insert(24);
        avlTree.insert(29);
        avlTree.insert(33);

        System.out.println("In-order Traversal:");
        avlTree.inOrder(avlTree.root);



    }
}
