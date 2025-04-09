package array_leetcode_easy;

import java.util.Scanner;

public class Richest_customer_wealth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of customers");
        int a= sc.nextInt();
        System.out.println("enter the number of banks ");
        int b=sc.nextInt();
        int [][]arr=new int[a][b];
        for(int i=0;i<a;i++){
            System.out.println("enter the bank wise wealth of customer "+(i+1));
            for(int j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The 2D array is:");
        System.out.print("[");
        for (int i = 0; i < a; i++) {
            System.out.print("[");
            for (int j = 0; j < b; j++) {
                System.out.print(+arr[i][j] + " ");
            }
            System.out.print("]");
        }
        System.out.println("]");
        for(int i=0;i<a;i++){
            System.out.print("wealth of customer "+(i+1)+" is :");
            int sum=0;
            for(int j=0;j<b;j++){
                sum=sum+arr[i][j];
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
