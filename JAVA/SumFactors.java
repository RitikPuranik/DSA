package JAVA;
import java.util.Scanner;

public class SumFactors {
    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     System.out.println("enter the number :");
    //     int n=sc.nextInt();
    //     System.out.print("the factors of "+n+" are : ");
    //     int sum=0;
    //     for(int i=1;i<=n;i++){
    //         if(n%i==0){
    //             System.out.print(i+" ");
    //             sum=sum+i;
    //         }
    //     }
    //     System.out.println();
    //     System.out.println("sum of factors of "+n+" is "+sum);
    //     sc.close();
    // }


    //BY METHODS
    static int factorSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        System.out.println("the sum of factors of "+n+" is "+factorSum(n));
        sc.close();
    }
}
