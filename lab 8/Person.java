package lab_8;

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Ensure compatibility
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
