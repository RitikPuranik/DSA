package ARRAY_ASSIGNMENT;
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        outerLoop:
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j>0;j--){
                if(arr[i]==arr[j-1]){
                    break outerLoop;
                }
            }
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println("Frequency of "+arr[i]+" is "+count);
        }
        sc.close();
    }
}
