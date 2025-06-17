package JAVA;
import java.util.Scanner;

public class ArmstrongRange {
    static int countDigits(int n){
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    static int sum(int n){
        int sum=0;
        int c=countDigits(n);
        while (n>0) {
            int dig=n%10;
            sum=sum+(int)Math.pow(dig,c);
            n=n/10;
        }
        return sum;
    }
    static boolean isArmstrong(int n){
        int sum=sum(n);
        if (n==sum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        System.out.println("enter start:");
        int start = sc.nextInt();
        System.out.println("enter end:");
        int end = sc.nextInt();
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if(isArmstrong(i)){
                System.out.print(i +" ");
            }
        }
        sc.close();
            
    }
}
