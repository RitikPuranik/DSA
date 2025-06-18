package JAVA;
import java.util.Scanner;

public class Factorial {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a number: ");
    //     int num = sc.nextInt();
    //     int factorial = 1;
    //     for (int i = 1; i <= num; i++) {
    //         factorial *= i;
    //     }
    //     System.out.println("Factorial of " + num + " is: " + factorial);
    //     sc.close();
    // }


    static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int factorial = fact(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
        sc.close();
    }
}
