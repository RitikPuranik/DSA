package JAVA;
import java.util.Scanner;

public class PrintPrimeRange {
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter the range: ");
    //     int n=sc.nextInt();
    //     int m=sc.nextInt();
        
        // System.out.print("Prime numbers between "+n+" and "+m+" are: ");
        // for(int i=n;i<=m;i++){
        //     int count=1;
        //     for(int j=2;j<i;j++){
        //         if(i%j==0){
        //             count=0;
        //             break;
        //         }
        //     }
        //     if(count==1){
        //         System.out.print(i+" ");
        //     }
        // }
        // sc.close();
    // }




    static void countPrime(int m , int n){

        for(int j=m;j<=n;j++){
            if(j<2){
                System.out.println(j+" not a prime number");
                continue;
            }
            int count=0;
            for(int i=2;i<=Math.sqrt(j);i++){
                if(j%i==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println(j+" is a prime number");
            }
            else{
                System.out.println(j+" is not a prime number");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        countPrime(n, m);
        sc.close();
    }
}
