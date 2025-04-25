package hashmap;
import java.util.Scanner;
import java.util.HashMap;
public class target {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of elements in array");
        int n =sc.nextInt();
        System.out.println("enter target");
        int  k=sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i< arr.length; i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer, Integer> TargetMap=new HashMap<>();
        int count =0;
        int a;
        
        for(int i=0;i<n;i++){
        
            if(TargetMap.containsKey( a=k-arr[i])){
                TargetMap.put(arr[i],a);
                count++;
            }

            else{
                TargetMap.put (arr[i],i);
            }
      
        }
        System.out.println("number of pairs"+count);
    }
   
}
