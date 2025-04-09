package array_leetcode_easy;
import java.util.Scanner;
public class sum2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the values of array one by one");
        for(int a=0;a<arr.length;a++){
            arr[a]=sc.nextInt();
        }
        System.out.println("enter the value of target");
        int k=sc.nextInt();
        int number=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if (arr[i]+arr[j]==k) {
                    number++;
                    System.out.println("the pairs are :"+arr[i]+","+arr[j]);
                }
            }  
        }
        if (number>0) {
            System.out.println("the number of pairs are :"+number);
        }
        else{
            System.out.println("no sum of pairs reached the target");
        }
        sc.close();
    }
}

