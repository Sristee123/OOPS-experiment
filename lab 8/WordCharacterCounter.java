package lab_8;

import java.io.*;
import java.util.Scanner;

public class WordCharacterCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = input.nextLine();
        
        File file = new File(fileName);
        
        if (!file.exists()) {
            System.out.println("Error: File not found!");
            input.close(); // Close the scanner before returning
            return;
        }

        try (Scanner scanner = new Scanner(file)) {
            int wordCount = 0, charCount = 0;
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (!line.isEmpty()) {
                    String[] words = line.split("\\s+"); // Splitting by spaces
                    wordCount += words.length;
                    
                    for (String word : words) {
                        charCount += word.length();
                    }
                }
            }

            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding spaces): " + charCount);
        } catch (FileNotFoundException e) {
            System.out.println("Error reading the file.");
        }
        
        input.close(); // Close the scanner after usage
    }
}

