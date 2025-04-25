import java.util.Scanner;

public class index2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array to group duplicates together
        mergeSort(arr, 0, n - 1);

        int[] unique = new int[n];
        int[] count = new int[n];

        int index = 0;
        int frequency = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                frequency++;
            } else {
                unique[index] = arr[i - 1];
                count[index] = frequency;
                index++;
                frequency = 1;
            }
        }

        // Store last element
        unique[index] = arr[n - 1];
        count[index] = frequency;
        index++;

        System.out.println("Element = Frequency:");
        for (int i = 0; i < index; i++) {
            System.out.println(unique[i] + " = " + count[i]);
        }

        sc.close();
    }

    // Merge Sort implementation
    public static void mergeSort(int[] arr1, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr1, left, mid);
            mergeSort(arr1, mid + 1, right);

            merge(arr1, left, mid, right);
        }
    }

    public static void merge(int[] arr1, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr1[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr1[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr1[k++] = L[i++];
            } else {
                arr1[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr1[k++] = L[i++];
        }

        while (j < n2) {
            arr1[k++] = R[j++];
        }
    }
}
