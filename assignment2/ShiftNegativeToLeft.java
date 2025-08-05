package assignment2;

public class ShiftNegativeToLeft {

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};
        int n = arr.length;

        // Create a new array to store the result
        int[] result = new int[n];
        int index = 0;

        // First add all negative numbers (preserve order)
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                result[index++] = arr[i];
            }
        }

        // Then add all non-negative numbers (preserve order)
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                result[index++] = arr[i];
            }
        }

        // Copy result back to original array (optional)
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }

        // Print the final array
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
