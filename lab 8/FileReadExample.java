package lab_8;
import java.io.*;
import java.util.Scanner;

public class FileReadExample {
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file); 
        
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = input.nextLine();
        
        try {
            readFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } 
        
        input.close();
    }
}
