
import java.util.*;

public class PalindromeCheck {
    public static void checkPalindrome(String str) {
        int n = str.length();
        boolean isPalindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        checkPalindrome(input);
        scanner.close();
    }
}

