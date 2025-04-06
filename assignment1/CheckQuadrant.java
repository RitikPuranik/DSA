package assignment1;
import java.util.Scanner;

public class CheckQuadrant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x :");
        int x=sc.nextInt();

        System.out.println("enter the value of y :");
        int y=sc.nextInt();

        if (x>0 && y>0) {
            System.out.println("The point lies in 1st Quadrant");
        } 
        else if(x<0 && y>0){
            System.out.println("The point lies in 2nd Quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("The point lies in 3rd Quadrant");
        }
        else {
            System.out.println("The point lies in 4th Quadrant");
        }
    }
    
}
