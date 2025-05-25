package ARRAY_ASSIGNMENT;
import java.util.Scanner;
public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.println("Duplicate array is:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        sc.close();
    }
}
