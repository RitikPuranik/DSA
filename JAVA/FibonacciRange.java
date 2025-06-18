package JAVA;
import java.util.Scanner;

public class FibonacciRange {
    static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range: ");
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();
        for(int i=start+1;i<=end+1;i++){
            System.out.print(fib(i)+" ");
        }
        scanner.close();
    }
}
