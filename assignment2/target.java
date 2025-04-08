package assignment2;
import java.util.Scanner;
public class target {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the values of array one by one");
        for(int a=0;a<arr.length;a++){
            arr[a]=sc.nextInt();
        }
        System.out.println("enter the value of target");
        int k=sc.nextInt();
        int number=0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if (arr[i]+arr[j]==k) {
        //             System.err.println(arr[i]+","+arr[j]+"are target");
        //             number++;
        //         }
        //     }  
        // }
        // if (number>0) {
        //     System.out.println("the number of pairs are :"+number);
        // }
        // else{
        //     System.out.println("no sum of pairs reached the target");
        // }

        int left=0;
        int sum = 0;
        int right=arr.length-1;
        while (left<right) {
            sum = arr[left]+arr[right];

            if (sum>k) {
                right--;
            }
            else if (sum<k) {
                left++;
            }
            else{
                left++;
                right--;
                number++;
            } 
        }
        System.out.println(number);
        sc.close();
    }
}
