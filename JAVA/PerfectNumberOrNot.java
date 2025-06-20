package JAVA;
import java.util.Scanner;

public class PerfectNumberOrNot {
    static int factorSum(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum; 
    }

    static boolean isPerfect(int n){
        if(factorSum(n)==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(isPerfect(n)){
            System.out.println(n+" is a perfect number");
        }
        else{
            System.out.println(n+" is not a perfect number");
        }
        sc.close();
    }
}
