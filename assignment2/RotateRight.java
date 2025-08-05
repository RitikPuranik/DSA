package assignment2;
import java.util.Scanner;

public class RotateRight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of Arrya");
        int n=sc.nextInt();
        System.out.println("Enter the elements the array");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter "+i+" elememt :");
            arr[i]=sc.nextInt();
        }
        
        int[] rotatedArr = rotateright(arr);

        System.out.println("Rotated array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(rotatedArr[i] + " ");
        }
        sc.close();
    }
    static int[] rotateright(int []arr){
        int []arr1=new int[arr.length];
        int j=1;
        arr1[0]=arr[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            arr1[j]=arr[i];
            j++;
        }

        return arr1;
    }
}
