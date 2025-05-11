package JAVA;
import java.util.Scanner;

public class PrintPrimeRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        System.out.print("Prime numbers between "+n+" and "+m+" are: ");
        for(int i=n;i<=m;i++){
            int count=1;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count=0;
                    break;
                }
            }
            if(count==1){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
