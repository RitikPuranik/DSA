package JAVA;
import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n= sc.nextInt();
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        if(n%sum==0){
            System.out.println(n+" is aharshad number");
        }
        else{
            System.out.println(n+" is not a harshad number");
        }
        sc.close();
        
    }
}
