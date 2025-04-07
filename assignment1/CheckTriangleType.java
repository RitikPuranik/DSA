package assignment1;
import java.util.Scanner;

public class CheckTriangleType {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Let the sides of Triangle be a,b,c");
        System.out.println("Enter the side a :");
        int a=sc.nextInt();

        System.out.println("Enter the side b :");
        int b=sc.nextInt();

        System.out.println("enter the side c :");
        int c=sc.nextInt();

        if (a==b && a==c) {
            System.out.println("The given triangle is an Equilateral triangle");
        }
        else if(a==b || b==c){
            System.out.println("The given triangle is an isosceles triangle");
        }
        else{
            System.out.println("The given triangle is an scalene triangle!");
        }
        sc.close();
    }
    
}
