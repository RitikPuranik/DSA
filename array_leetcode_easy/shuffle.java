package array_leetcode_easy;

import java.util.Scanner;

public class shuffle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of element of array in even number");
        int m=sc.nextInt();
        int arr[]=new int[m];
        System.out.println("enter the elements of array :");
        for(int i=0;i<m;i=i+2){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<m;i=i+2){
            arr[i]=sc.nextInt();
        }
        System.out.println("the shuffled array is :");
        for(int i=0;i<m;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
