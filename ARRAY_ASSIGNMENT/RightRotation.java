package ARRAY_ASSIGNMENT;
import java.util.Scanner;
public class RightRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of rotation");
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            for(int j=0;j<n-1;j++){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            System.out.print("Array after rotation "+(i+1)+" times is :");
            for(int j=0;j<n;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
