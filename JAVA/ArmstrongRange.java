package JAVA;
import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        System.out.println("enter start:");
        int start = sc.nextInt();
        System.out.println("enter end:");
        int end = sc.nextInt();
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                int rem = temp % 10;
                sum += rem * rem * rem;
                temp = temp / 10;
            }
            if (i == sum) {
                System.out.print(i + " ");
            }
        }
        sc.close();
            
    }
}
