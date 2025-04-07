
import java.util.Scanner;

public class missing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elemts in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum1=((n*(n+1))/2);
        int sum=0;
        for(int i=0;i<arr.length;i++){
          
                sum=sum+arr[i]; }
            
          int number=sum1-sum;
            System.out.println("missing number "+number);
        }
}
