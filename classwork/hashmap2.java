import java.util.Scanner;
import java.util.HashMap;
public class hashmap2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int k=sc.nextInt();
        int []arr= new int[k];
        for (int index = 0; index < arr.length; index++) {
            arr[index]=sc.nextInt();
        }
        
        HashMap<Integer,Integer>SAME=new HashMap<>();
        int flag=-1;
        for(int i=0;i<arr.length;i++){
            if (SAME.containsKey(arr[i])) {
                int repeating=SAME.get(arr[i]);
                SAME.put(arr[i],flag);
            }
        else{
           
            SAME.put(arr[i],i);
        }}
        if (flag!=-1){
            System.out.println(SAME);   
        }
    }
}