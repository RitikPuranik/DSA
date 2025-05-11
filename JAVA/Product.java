package JAVA;
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of natural numbers to be multiplied: ");
        int n=sc.nextInt();
        int product=1;
        for(int i=2;i<=n;i++){
            product=product*i;
        }
        System.out.println("the product of the first "+n+" natural numbers is: "+product); 
        sc.close();
    }
}
