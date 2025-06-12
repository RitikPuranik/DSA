package JAVA;
import java.util.Scanner;

public class PrintNumberuptoN {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("enter the number natural number to print");
    //     int n = sc.nextInt();
    //     for(int i=1;i<=n;i++){
    //         System.out.print(i+" ");
    //     }
    //     sc.close();
    // }


    //BY METHODS
    static void disp(int n){
         for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number natural number to print");
        int n = sc.nextInt();
        disp(n);
        sc.close();
    }
}
