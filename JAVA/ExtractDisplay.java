package JAVA;
import java.util.Scanner;

public class ExtractDisplay {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("enter the number");
    //     int n = sc.nextInt();
    //     int count=0;
    //     int m=n;
    //     while(n>0){
    //         count++;
    //         n=n/10;
    //     }
    //     int []arr=new int[count];
    //     int i=0;
    //     while(m>0){
    //         arr[i]=m%10;
    //         i++;
    //         m=m/10;
    //     }
    //     for(int j=arr.length-1;j>=0;j--){
    //         System.out.print(arr[j]+" ");
    //     }
    //     sc.close();
    // }

    //BY METHODS


    //PRINT BY ORDER

    // static void digits(int n){
    //     int count=0;
    //     int m=n;
    //     while(n>0){
    //         count++;
    //         n=n/10;
    //     }
    //     int []arr=new int[count];
    //     int i=0;
    //     while(m>0){
    //         arr[i]=m%10;
    //         i++;
    //         m=m/10;
    //     }
    //     for(int j=arr.length-1;j>=0;j--){
    //         System.out.print(arr[j]+" ");
    //     }
    // }



    //PRINT IN REVERSE

    static void digits(int n){
        while(n>0){
            int digit = n % 10;
            System.out.println(digit);
            n=n/10;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        digits(n);
        sc.close();
    }
}
