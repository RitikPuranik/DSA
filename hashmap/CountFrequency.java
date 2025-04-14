package hashmap;

import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        int []arr={5,2,5,2,3};
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
