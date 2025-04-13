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
        int [] arr1=new int[n];
        int [] arr2=new int[n];
        System.out.println("enter the indexes of array");
        for(int i=0;i<arr.length;i++){
            arr1[i]=sc.nextInt();
        }
        int j=0;
        for(int i=arr1[j];i<arr.length;i++){
            arr2[i]=arr[j];
            j++;
            
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }

    }
 }
