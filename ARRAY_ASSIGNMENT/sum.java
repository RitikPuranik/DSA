package ARRAY_ASSIGNMENT;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("the sum of array is "+sum);
        sc.close();
    }
}
