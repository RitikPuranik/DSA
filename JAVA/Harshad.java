package JAVA;
import java.util.Scanner;

public class Harshad {
    static int sumDigits(int n){
        int sum=0;
        while(n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
    static boolean isHarshad(int n){
        if(n%sumDigits(n)==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n= sc.nextInt();
        if(isHarshad(n)){
            System.out.println(n+" is harshad number");
        }
        else{
            System.out.println(n+" is not a harshad number");
        }
        sc.close();
        
    }
}
