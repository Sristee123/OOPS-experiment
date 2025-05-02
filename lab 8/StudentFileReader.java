package lab_8;

import java.io.*;

public class StudentFileReader {
    public static void main(String[] args) {
        File file = new File("student.txt");
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}

