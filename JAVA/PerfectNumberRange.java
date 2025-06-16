package JAVA;
import java.util.Scanner;

public class PerfectNumberRange {
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
        System.out.println("Enter the range: ");
        System.out.println("enter start :");
        int n=sc.nextInt();
        System.err.println("enter end");
        int m=sc.nextInt();
        System.out.println("Perfect numbers in the range are: ");
        for(int i=n;i<=m;i++){
            if(isPerfect(i)){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
