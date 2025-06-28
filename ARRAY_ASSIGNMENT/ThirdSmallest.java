package ARRAY_ASSIGNMENT;

import java.util.Scanner;

public class ThirdSmallest {
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
        int secondMin=Integer.MAX_VALUE;
        int thirdMin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                thirdMin=secondMin;
                secondMin=min;
                min=arr[i];
            }
            else if(arr[i]<secondMin && arr[i]!=min){
                thirdMin=secondMin;
                secondMin=arr[i];
            }
            else if(arr[i]<thirdMin && arr[i]!=min && arr[i]!=secondMin){
                thirdMin=arr[i];
            }
        }
        if (thirdMin == Integer.MAX_VALUE) {
            System.out.println("There is no third smallest element in the array.");
        }
        else{
            System.out.println("The third smallest element in the array is: " + thirdMin);
        }
        sc.close();
        
    }
}
