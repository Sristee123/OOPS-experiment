package lab_9;

import java.util.*;

public class UniqueNames {
    public static void main(String[] args) {
        String[] namesArray = {"Aman", "Varchasv", "Sourabh", "Varchasv", "Aman"};
        HashSet<String> uniqueNames = new HashSet<>(Arrays.asList(namesArray));

        String searchName = "Varchasv";
        System.out.println("Contains '" + searchName + "': " + uniqueNames.contains(searchName));

        System.out.println("Unique names:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}

