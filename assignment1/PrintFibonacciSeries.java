package assignment1;

import java.util.Scanner;

public class PrintFibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements to print for fibonacci series");

        int limit=sc.nextInt()-2;
        int a=1;
        int b=2;
        int sum=0;
        System.out.print(a +" ");
        System.out.print(b+" ");
        for(int i=1;i<=limit;i++){
            sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
        sc.close();
    }
}
