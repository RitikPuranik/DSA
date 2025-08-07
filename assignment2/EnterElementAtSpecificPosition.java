package assignment2;
import java.util.Scanner;

public class EnterElementAtSpecificPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the Elements of Array");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element at "+(i+1)+" Position :");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Element");
        int x=sc.nextInt();
        System.out.println("Enter the size of array");
        int index=sc.nextInt()-1;
        int []newArr=insertArray(x, index, arr);
        System.out.println("NewArray is :");
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
        sc.close();
    }
    static int[] insertArray(int x,int y,int[]arr){
        int[]arr1=new int[arr.length +1];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(i==y){
                arr1[j++]=x;
            }
            arr1[j++]=arr[i];
        }
        return arr1;
    }
}
