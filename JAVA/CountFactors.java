package JAVA;
import java.util.Scanner;

public class CountFactors {
    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     System.out.println("enter the number :");
    //     int n=sc.nextInt();
    //     System.out.print("the factors of "+n+" are : ");
    //     int count=0;
    //     for(int i=1;i<=n;i++){
    //         if(n%i==0){
    //             System.out.print(i+" ");
    //             count++;
    //         }
    //     }
    //     System.out.println();
    //     System.out.println("number of factors of "+n+" is "+sum);
    //     sc.close();
    // }


    //BY METHODS
    static int countfactor(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        System.out.println("the number of factors of "+n+" is "+countfactor(n));
        sc.close();
    }
}
