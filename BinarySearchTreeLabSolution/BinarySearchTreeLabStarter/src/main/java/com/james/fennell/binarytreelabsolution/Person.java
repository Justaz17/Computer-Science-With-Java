package com.james.fennell.binarytreelabsolution;

import java.util.Random;

public class Person implements Comparable<Person>{
    private static Random rand = new Random(); // Static counter for unique IDs
    int id; // Unique identifier
    String name;
    int age;

    // Constructor to auto-increment ID and set name and age
    public Person(String name, int age) {
        this.id = rand.nextInt(Integer.MAX_VALUE);
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", " + name + " (" + age + ")";
    }

    @Override
    public int compareTo(Person other) {
        // Compare ids
        return this.id - other.id; 
    }
}
