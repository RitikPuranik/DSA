package ARRAY_ASSIGNMENT;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to be searched: ");
        int target=sc.nextInt();
        int start=0;
        int end=n-1;
        boolean found=false;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println("element found at index: "+mid);
                found=true;
                break;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        if (found==false) {
            System.out.println("element not found");
        }
        sc.close();
    }
}
