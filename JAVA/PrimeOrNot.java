package JAVA;
import java.util.Scanner;

public class PrimeOrNot {
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter a number to check whether it is prime or not:");
    //     int n=sc.nextInt();
    //     boolean flag=true;
    //     for(int i=2;i<n;i++){
    //         if(n%i==0){
    //             flag=false;
    //             break;
    //         }
    //     }
    //     if(flag){
    //         System.out.println(n+" is a prime number");
    //     }
    //     else{
    //         System.out.println(n+" is not a prime number");
    //     }
    //     sc.close();
    // }



    //BY METHODS
    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        int count=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or not:");
        int n=sc.nextInt();
        if(isPrime(n)){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
        sc.close();
    }
    
}
