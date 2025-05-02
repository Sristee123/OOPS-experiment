package lab_9;

import java.util.*;

public class PrimeCheck {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 5, 8, 9, 11));

        for (Integer num : numbers) {
            int val = num; // unboxing
            boolean isPrime = true;

            if (val < 2) isPrime = false;
            else {
                for (int i = 2; i <= Math.sqrt(val); i++) {
                    if (val % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            System.out.println(val + " is " + (isPrime ? "a prime number" : "not a prime number"));
        }
    }
}

