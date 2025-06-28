package ARRAY_ASSIGNMENT;
import java.util.Scanner;

public class SecondLargest {
    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     System.out.println("enter the  size of array");
    //     int n= sc.nextInt();
    //     int arr[]=new int[n];
    //     System.out.println("enter the elements of array");
    //     for(int i=0;i<n;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]>max){
    //             max=arr[i];
    //         }
    //     }
    //     int secondMax=Integer.MIN_VALUE;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]>secondMax && arr[i]<max){
    //             secondMax=arr[i];
    //         }
    //     }
    //     System.out.println("second largest element is "+secondMax);
    //     sc.close();
    // }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the  size of array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int Secondmax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                Secondmax=max;
                max=arr[i];
            }
            else if(arr[i]>Secondmax && arr[i]!=max){
                Secondmax=arr[i];
            }
        }
        System.out.println(Secondmax);
        sc.close();
    }
}
