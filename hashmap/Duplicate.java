package hashmap;
import java.util.HashMap;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        HashMap<Integer,Integer>Map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if (Map.containsKey(arr[i])) {
                int Freq=Map.get(arr[i]);
                Freq++;
                Map.put(arr[i], Freq);
            }
            else{
                Map.put(arr[i],1);
                arr[left];
            }
        }
        
    }
}
