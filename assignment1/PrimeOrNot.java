package assignment1;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number between 1-100 :");
        int x=sc.nextInt();

        int flag=0;
        for(int i=2 ; i<x ; i++){
            if (x%i==0) {
                flag++;
                System.out.println("i");
                break;
            }
        }
        if(flag == 1){
            System.out.println("the given number is not a prime number");
        }
        else{
            System.out.println("the given number is a prime number");
        }
        sc.close();
    }
}
