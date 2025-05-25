package ARRAY_ASSIGNMENT;
import java.util.Scanner;

public class ShiftZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Shift non-zero elements forward
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Fill remaining elements with 0
        while (index < n) {
            arr[index++] = 0;
        }

        System.out.println();
        System.out.print("Array after shifting zeroes to the end: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
