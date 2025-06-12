package JAVA;
import java.util.Scanner;

public class EvenBtwGivenRange {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the range");
    //     int n = sc.nextInt();
    //     int m = sc.nextInt();
    //     System.out.println("Even numbers between "+n+" and "+m+" are : ");
    //     for(int i=n;i<m;i++){
    //         if(i%2==0){
    //             System.out.print(i+" ");
    //         }
            
    //     }
    //     sc.close();
        
    // }



    //BY METHODS
    // static void disp(int x,int y ){
    //     for(int i=x;i<=y;i++){
    //         if(i%2==0){
    //             System.out.println(i+" ");
    //         }
    //     }
    // }
    //  public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the range");
    //     int n = sc.nextInt();
    //     int m = sc.nextInt();
    //     disp(n, m);
    //     sc.close();
    //  }   



     //another method
     static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
     }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=n ;i<=m;i++){
            if(isEven(i)){
                System.out.println(i);
            }
        }
     }
}
