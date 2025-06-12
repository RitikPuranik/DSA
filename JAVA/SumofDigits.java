package JAVA;
import java.util.Scanner;

public class SumofDigits {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the number: ");
    //     int num = sc.nextInt();
    //     int sum = 0;
    //     while (num > 0) {
    //         int digit = num % 10;
    //         sum += digit;
    //         num /= 10;
    //     }
    //     System.out.println("Sum of digits: " + sum);
    //     sc.close();
    // }


    //BY METHODS
    static int digitSum(int n){
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(digitSum(n));
        sc.close();
    }
}
