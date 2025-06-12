package JAVA;
import java.util.Scanner;

public class ReverseNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int n = sc.nextInt();
//         int rev=0;
//         while(n>0){
//             int show=n%10;
//              rev=rev*10+show;
//             // System.out.print(show);
//             n=n/10;
//         }
//         System.out.println(rev);
//         sc.close();
//     }

    //BY METHODS
    static int reverse (int n){
        int rev=0;
        while(n>0){
            int show=n%10;
             rev=rev*10+show;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println(reverse(n));
        sc.close();
    }
}

