package JAVA;
import java.util.Scanner;

public class Fibonacci {
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Enter the number of terms: ");
    //     int n = scanner.nextInt();
    //     int a=0,b=1,c;
    //     System.out.print("Fibonacci Series: ");
    //     for(int i=1;i<=n;i++){
    //         System.out.print(a+" ");
    //         c=a+b;
    //         a=b;
    //         b=c;
    //     }
    //     scanner.close();
        
    // }

    static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fib(i)+" ");
        }
        scanner.close();
    }
}
