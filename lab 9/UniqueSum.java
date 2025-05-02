package lab_9;

import java.util.*;

public class UniqueSum {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 5, 3, 8, 2, 5));
        HashSet<Integer> uniqueNums = new HashSet<>(nums);

        int sum = 0;
        for (int num : uniqueNums) {
            sum += num;
        }

        System.out.println("Unique values: " + uniqueNums);
        System.out.println("Sum: " + sum);
    }
}

