package ARRAY_ASSIGNMENT;
import java.util.Scanner;
public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array"); 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int even=0,odd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("number of even elements are "+even);
        System.out.println("number of odd elements are "+odd);
        sc.close(); 

    }
}
