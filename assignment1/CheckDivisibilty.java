package assignment1;
import java.util.Scanner;

public class CheckDivisibilty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check divisibility :");
        int a=sc.nextInt();

        if(a%5==0 && a%7==0){
            System.out.println("the given number is divisible by 5 and 7 ");
        }
        else{
            System.out.println("the given number is not divisble by 5 or 7");
        }

    }
}
