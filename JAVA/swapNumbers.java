package JAVA;

import java.util.Scanner;

public class swapNumbers {
    // static void swap(int a, int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println("first number = " + a + " second number = " + b);
    // }

    // static void swap(int a, int b){
    //     a = a+b;
    //     b = a-b;
    //     a = a-b;
    //     System.out.println("first number  = " + a + " second number = " + b);
    // }

    static void swap(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("first number  = " + a + " second number = " + b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();
        swap(a,b);
        sc.close();
    }
}
