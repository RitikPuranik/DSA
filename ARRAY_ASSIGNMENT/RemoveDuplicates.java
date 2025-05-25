package ARRAY_ASSIGNMENT;
import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array in sorted order: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                arr[left]=arr[i];
                left++;
            }
        }
        System.out.println("Array after removing duplicates: ");
        for(int i=0;i<left;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
