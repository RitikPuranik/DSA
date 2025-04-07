package assignment1;
import java.util.Scanner;

public class CheckEmployeeEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of times worked(in hours) :");
        int time =sc.nextInt();

        System.out.println("Are you a full time employee?(True/False)");
        boolean status=sc.nextBoolean();

        if (time>40 && status) {
            System.out.println("You are eligible for overtime pay!");
            
        }
        else{
            System.out.println("You are not eligible for overtime pay!");
        }
        sc.close();
    }
    
}
