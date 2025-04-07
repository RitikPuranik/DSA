package assignment1;

import java.util.Scanner;

public class LibraryLateFees{
    public static void  main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the type of book");
        System.out.println("1. Regular");
        System.out.println("2. fiction");
        System.out.println("3. refernce");

        int book=sc.nextInt();

        System.out.println("enter the number of days overdue(in number)");
        int days=sc.nextInt();

        if(book==1){
            double fine=days*0.50;
            System.out.println("fees to be paid :"+fine+"$");
        }
        else if (book==2) {
            double fine=days*0.75;
            System.out.println("fees to be paid :"+fine+"$");
            
        } 
        else if (book==3) {
            System.out.println("no late fee");
        }
        else {
            System.out.println("entered wrong type of book....Please try again");
            
        }
        System.out.println("THANK YOU!!!");
        sc.close(); 
    }
}