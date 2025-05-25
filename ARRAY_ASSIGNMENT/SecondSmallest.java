package ARRAY_ASSIGNMENT;
import java.util.Scanner;
public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the  size of array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int secondMin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<secondMin && arr[i]>min){
                secondMin=arr[i];
            }
        }
        System.out.println("second smallest element is "+secondMin);
        sc.close();
    }
}
