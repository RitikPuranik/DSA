package JAVA;
import java.util.Scanner;

public class FactorsNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        System.out.print("the factors of "+n+" are : ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }



    //BY METHODS

}
