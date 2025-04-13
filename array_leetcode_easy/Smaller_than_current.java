package array_leetcode_easy;
import java.util.Scanner;
public class Smaller_than_current {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int small=0;
        for(int i=0;i<n;i++){
            int count=0;
            small=arr[i];
            for(int j=0;j<n;j++){
                if(arr[j]<small){
                    count++;
                }
            }
            System.out.print(count+" ");
        }
        sc.close();

        
    }
}

