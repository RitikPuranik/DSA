package JAVA;
import java.util.Scanner;

public class EvenBtwGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Even numbers between "+n+" and "+m+" are : ");
        for(int i=n;i<m;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
            
        }
        sc.close();
        
    }
    
}
