package assignment2;
import java.util.Scanner;

public class MergeTwoArrays {
    static int[] merge(int []arr1,int[]arr2){
        int[]arr3=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        for( ;i<arr1.length;i++){
            arr3[k++]=arr1[i];
        }
        for( ;j<arr2.length;j++){
            arr3[k++]=arr2[j];
        }

        return arr3;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the size of array 1:");
        int n1=sc.nextInt();
        System.out.println("Enter the size of array 2:");
        int n2=sc.nextInt();
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        System.out.println("Enter the elements of array 1:");
        for(int i=0;i<n1;i++){
            System.out.print("Enter the element "+(i+1)+":");
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of array 2:");
        for(int i=0;i<n2;i++){
            System.out.print("Enter the element "+(i+1)+":");
            arr2[i]=sc.nextInt();
        }
        for(int x: merge(arr1, arr2)){
            System.out.print(x+" ");
        }
        sc.close();
    }
}
