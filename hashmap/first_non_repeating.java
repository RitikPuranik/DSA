package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class first_non_repeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> frequencyMap= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if (frequencyMap.containsKey(arr[i])) {
                int Freq=frequencyMap.get(arr[i]);
                Freq=-1;
                frequencyMap.put(arr[i], Freq);
            }
            else{
                frequencyMap.put(arr[i],i);
            }
        }
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(frequencyMap.get(arr[i])!=-1){
                if(min>frequencyMap.get(arr[i])){
                min=frequencyMap.get(arr[i]);
                }
                break;
            }
        }
        System.out.println("first non repeating element is "+arr[min]);
    }
}
