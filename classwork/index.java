import java.util.HashMap;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer, Integer>map=new HashMap<>();
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter the elements of the array");

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter target");
        int target=sc.nextInt();

        int number=0;
        for(int i=0;i<=n-1;i++) {
            if(map.containsKey(target-arr[i])){
               // map.put(arr[i], i);
                number++;

            }
            else {
                map.put(arr[i],i);
            }
            
        }
        System.out.println("number of pairs are "+number);
        sc.close();
    }
}
