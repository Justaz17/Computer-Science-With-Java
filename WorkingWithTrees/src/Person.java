import java.util.Random;

// Person class with unique ID, name, age, and Comparable interface for sorting
class Person implements Comparable<Person> {
    private static Random rand = new Random(); // Random Number generator for unique IDs
    int id; // Unique identifier
    String name;
    int age;
    // Constructor to auto generate ID and set name and age
    public Person(String name, int age) {
        // Set the id using the random number generator
        // Set the name and age fields using the constructor parameters
        this.name = name;
        this.age = age;
        this.id = rand.nextInt()*10;

    }
    @Override
    public String toString() {
        // Return a formatted string showing the Person's id, name, and age
        return id + " " + name + " " + age;

    }
    // Implement the Comparable<Person> interface to compare Person objects by id
    @Override
    public int compareTo(Person other) {
        // Use subtraction or Integer.compare to compare the ids of two Person objects
        //Ref
        // https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html
        //compareTo Method: Compares the current object with another object.
        //It returns:
        //A positive integer if the current object is greater.
        //A negative integer if the current object is lesser.
        //Zero if both objects are equal
        return Integer.compare(this.id, other.id);
    }
}