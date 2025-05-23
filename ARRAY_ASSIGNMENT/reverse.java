package ARRAY_ASSIGNMENT;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("the reverse of the array");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
