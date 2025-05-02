package lab_8;

import java.io.*;
public class PersonSerialization {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        
        // Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
            oos.writeObject(person);
            System.out.println("Object serialized successfully!");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Deserialized Object:");
            deserializedPerson.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}

