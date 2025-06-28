package ARRAY_ASSIGNMENT;

import java.util.Scanner;

public class ThirdLargest {
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
        int secondMax=Integer.MIN_VALUE;
        int thirdMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                thirdMax=secondMax;
                secondMax=max;
                max=arr[i];
            }
            else if(arr[i]>secondMax && arr[i]<max){
                thirdMax=secondMax;
                secondMax=arr[i];
            }
            else if(arr[i]>thirdMax && arr[i]<secondMax){
                thirdMax=arr[i];
            }
        }
        if(thirdMax==Integer.MIN_VALUE){
            System.out.println("there is no third largest element");
        }
        else{
            System.out.println("third largest element is "+thirdMax);
        }
        sc.close();

    }
}
