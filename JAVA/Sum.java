package JAVA;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("the sum is : "+sum);
        sc.close();
    }
}
