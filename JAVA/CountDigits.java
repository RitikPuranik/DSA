package JAVA;
import java.util.Scanner;

public class CountDigits {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a number: ");
    //     int num = sc.nextInt();

    //     int count = 0;
    //     while (num != 0) {
    //         num /= 10;
    //         count++;
    //     }

    //     System.out.println("Number of digits in the number: " + count);
    //     sc.close();
    // }

    //BY METHODS
    static int countDigits(int n){
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(countDigits(num));
    }
}
