package hashmap;
import java.util.HashMap;
import java.util.Scanner;
public class Most_frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> frequencyMap= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if (frequencyMap.containsKey(arr[i])) {
                int Freq=frequencyMap.get(arr[i]);
                Freq++;
                frequencyMap.put(arr[i], Freq);
            }
            else{
                frequencyMap.put(arr[i],1);
            }
        }
        System.out.println(frequencyMap);
    }
}
