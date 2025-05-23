package ARRAY_ASSIGNMENT;
import java.util.Scanner;

public class DisplayIntegers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements you want to enter");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the elements of array are");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
            
    }
}
