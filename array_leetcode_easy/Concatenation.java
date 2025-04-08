package array_leetcode_easy;
import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array :");
        int k=sc.nextInt();
        int []arr=new int[k];
        int []arr2=new int[2*k];
        System.out.println("enter the elements of array :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            arr2[i]=arr[i];
        }
        System.out.println("concatenated array is :");
        for(int i=arr.length;i<arr2.length;i++){
            arr2[i]=arr[i-arr.length];
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        sc.close();
    }
}
