package array_leetcode_easy;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int k=sc.nextInt();
        int [] arr=new int[k];
        System.out.println("enter the elemnts of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            System.out.print(sum+" ");
        }
        sc.close();
    }
    
}
