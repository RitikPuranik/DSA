package assignment1;

import java.util.Scanner;
public class GradingSyatem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the marks out of 100");
        System.out.println("enter the marks of maths");
        int maths=sc.nextInt();

        System.out.println("enter the marks of physics");
        int physics=sc.nextInt();
        
        System.out.println("enter the marks of chemistry");
        int chemistry=sc.nextInt();

        double average=(maths+physics+chemistry)/3;

        if (average>=90) {
            System.out.println("You have received Grade A");
            
        }
        else if (average>=80 && average<90) {
            System.out.println("You have received Grade B");
            
        }
        else if (average>=70 && average<80) {
            System.out.println("You have received Grade C");
            
        }
        else if (average>=60 && average<70) {
            System.out.println("You have received Grade D");
            
        }
        else if ( average<60) {
            System.out.println("You have received Grade F");
            
        } else {
            System.out.println("you have entered the wrong marks");
        }
    }
    
}
