package JAVA;
import java.util.Scanner;

public class LCM {
    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        System.out.println("LCM of " + a + " and " + b + " is: " + (a*b)/gcd(a, b));
        sc.close();
    }
}
