public class Main {
    public static void main(String[] args) {
        // Create an instance of BinarySearchTree for Integer
        BinarySearchTree<Integer> intTree = new BinarySearchTree<>();
        // Insert several integer values into the tree
        intTree.insert(10);
        intTree.insert(20);
        intTree.insert(30);
        intTree.insert(40);
        intTree.insert(50);
        intTree.insert(60);
        // Call inOrder traversal method to print the integers in sorted order
        intTree.inOrder(intTree.root);
        // Create an instance of BinarySearchTree for Person
        BinarySearchTree<Person> personTree = new BinarySearchTree<>();
        // Insert several Person objects into the tree
        Person person1 = new Person("John", 40);
        Person person2 = new Person("Jane", 30);
        Person person3 = new Person("Bob", 30);

        personTree.insert(person1);
        personTree.insert(person2);
        personTree.insert(person3);
        // Call inOrder traversal method to print the Person objects in order by id
        personTree.inOrder(personTree.root);
    }
}