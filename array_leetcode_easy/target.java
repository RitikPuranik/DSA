package array_leetcode_easy;
import java.util.Scanner;

public class target {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int []arr1=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr1[i]=sc.nextInt();
        }
        int [] arr2=new int[n];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
            if (arr2[i]!=arr1) {
                
            }
            
        }
    }
}