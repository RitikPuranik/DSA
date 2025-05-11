package ARRAY;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        while(n>0){
            int show=n%10;
            System.out.print(show);
            n=n/10;
        }
        sc.close();
    }
}
