package assignment1;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int a=sc.nextInt();

        System.out.println("enter the number whose power you need to raise :");
        int b=sc.nextInt();

        int product=a;
        for(int i=1 ; i<b ; i++){
            product=product*a;
        }
        System.out.println(a+"^"+b+":"+product);
    }
    
}
