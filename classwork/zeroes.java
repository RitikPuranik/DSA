
import java.util.Scanner;

public class zeroes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elemts in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int nonzero = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero = zero + 1;
            }

            else if (arr[i] != 0) {
            nonzero = nonzero + 1;
            }
        }

        System.out.println("non-zero=" + nonzero + "zero=" + zero);
        

    int[] arr1= new int[n];
    int index = 0;
    for (int i = 0; i < n; i++) {
        if (arr[i] != 0) {
            arr1[index] = arr[i];
            index++;
        }
    }
    System.out.println("Array after moving all zeroes to the end:");
    for (int i = 0; i < n; i++) {
        System.out.print(arr1[i] + " ");
    }
   sc.close();
}
}
