package ARRAY_ASSIGNMENT;
import java.util.Scanner;
public class reverse {
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter the size of array");
    //     int n=sc.nextInt();
    //     int arr[]=new int[n];
    //     System.out.println("enter the elements of array");
    //     for(int i=0;i<n;i++)
    //     {
    //         arr[i]=sc.nextInt();
    //     }
    //     System.out.println("the reverse of the array");
    //     for(int i=n-1;i>=0;i--)
    //     {
    //         System.out.print(arr[i]+" ");
    //     }
    //     sc.close();
    // }



    static int[] reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        System.out.println("the reverse of the array");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
        
    }
}
