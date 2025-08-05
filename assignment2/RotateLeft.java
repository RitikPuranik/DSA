package assignment2;
import java.util.Scanner;

public class RotateLeft {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of Array");
        int n=sc.nextInt();
        System.out.println("Enter the elements the array");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+" elememt :");
            arr[i]=sc.nextInt();
        }
        int[] rotatedArr = rotateleft(arr);

        System.out.println("Rotated array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(rotatedArr[i] + " ");
        }
        sc.close();
    }
    static int[] rotateleft(int []arr){
        int []arr1=new int[arr.length];
        int j=0;
        arr1[arr.length-1]=arr[0];
        for(int i=1;i<arr.length;i++){
            arr1[j]=arr[i];
            j++;
        }
        return arr1;
    }
}

