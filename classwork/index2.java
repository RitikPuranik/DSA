import java.util.Scanner;

public class Index2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] input = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        // Sort the array to group duplicates together
        mergeSort(input, 0, n - 1);

        int[] unique = new int[n];
        int[] count = new int[n];

        int index = 0;
        int frequency = 1;

        for (int i = 1; i < n; i++) {
            if (input[i] == input[i - 1]) {
                frequency++;
            } else {
                unique[index] = input[i - 1];
                count[index] = frequency;
                index++;
                frequency = 1;
            }
        }

        // Store last element
        unique[index] = input[n - 1];
        count[index] = frequency;
        index++;

        System.out.println("Element = Frequency:");
        for (int i = 0; i < index; i++) {
            System.out.println(unique[i] + " = " + count[i]);
        }

        sc.close();
    }

    // Merge Sort implementation
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
}
