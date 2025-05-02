package lab_8;

import java.io.*;
import java.util.Scanner;

public class StudentFileWriter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String name = input.nextLine();
        
        System.out.print("Enter roll number: ");
        String rollNumber = input.nextLine();
        
        System.out.print("Enter grade: ");
        String grade = input.nextLine();

        try (FileWriter writer = new FileWriter("student.txt", true)) { // Append mode
            writer.write("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n");
            System.out.println("Student information saved successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        
        input.close();
    }
}

