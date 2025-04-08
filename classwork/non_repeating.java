import java.util.Scanner;
import java.util.HashMap;
public class non_repeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int k=sc.nextInt();
        int []arr= new int[k];
        for (int index = 0; index < arr.length; index++) {
            arr[index]=sc.nextInt();
        }
        
        // HashMap<Integer,Integer>SAME=new HashMap<>();
        // int flag=-1;
        // for(int i=0;i<arr.length;i++){
        //     if (SAME.containsKey(arr[i])) {
        //         int repeating=SAME.get(arr[i]);
        //         SAME.put(arr[i],flag);
        //     }
        // else{
           
        //     SAME.put(arr[i],i);
        // }}
        // if (flag!=-1){
        //     System.out.println(SAME);   
        // }
        HashMap<Integer,Integer>IndexMap=new HashMap<>();
        int min=Integer.MAX_VALUE;
		int finalKey=0;
		for(int i=0;i<arr.length;i++) {
			if(IndexMap.containsKey(arr[i])) {
				int key = IndexMap.get(arr[i]);
				key--;
				IndexMap.put(arr[i], key);
			}
			else {
				IndexMap.put(arr[i], i);
			}
		}
		for (Integer key : IndexMap.keySet()) {
			if(IndexMap.get(key)>0 && IndexMap.get(key)<min) {
				min=IndexMap.get(key);
				finalKey=key;
			}
			
		    System.out.println("Element: " + key + ", Index: " + IndexMap.get(key));
		   
		}
		 System.out.println("First Non - repeating element is:"+finalKey);
        sc.close();
    }
}