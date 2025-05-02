import java.util.*;

public class RotateArray {
    public static void rotateArray(int[] arr, int K) {
        int n = arr.length;
        K = K % n; 
        reverseArray(arr, 0, n - 1); 
        reverseArray(arr, 0, K - 1); 
        reverseArray(arr, K, n - 1); 
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of positions to rotate (K): ");
        int K = scanner.nextInt();
        rotateArray(arr, K);
        System.out.println("Rotated array: " + Arrays.toString(arr));
        scanner.close();
    }
}

