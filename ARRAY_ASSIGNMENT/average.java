package ARRAY_ASSIGNMENT;
import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int avg=sum/n;
        System.out.println("average of array is "+avg);
        sc.close();
        
    }
}
