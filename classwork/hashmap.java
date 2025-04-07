import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        int arr[]={3,2,2,3,6,9};
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
