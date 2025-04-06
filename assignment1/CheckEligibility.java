package assignment1;
import java.util.Scanner;

public class CheckEligibility {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age(in years) :");
        int age=sc.nextInt();

        System.out.println("are you a citizen or not(True/False) :");
        boolean citizen=sc.nextBoolean();

        if(age>=18 && citizen){
            System.out.println("you are eligible to vote!");
        }
        else{
            System.out.println("you are not eligible to vote!");
        }
    }
    
}
