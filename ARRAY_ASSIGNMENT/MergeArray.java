package ARRAY_ASSIGNMENT;
import java.util.Scanner;
public class MergeArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array 1");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array 1");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the size of array 2");
        int m=sc.nextInt();
        int arr1[]=new int[m];
        System.out.println("Enter the elements of array 2");
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        int []merge=new int[n+m];
        for(int i=0;i<n;i++){
            merge[i]=arr[i];
        }
        for(int i=0;i<m;i++){
            merge[n+i]=arr1[i];
        }
        System.out.println("The merged array is:");
        for(int i=0;i<n+m;i++){
            System.out.print(merge[i]+" ");
        }
        sc.close(); 
    }
}
