package hashmap;

import java.util.HashMap;

public class Element_that_appears {
    public static void main(String[] args) {
         int []arr={4,1,2,1,2};
         int []arr2=new int[arr.length];
        HashMap<Integer,Integer> frequencyMap= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if (frequencyMap.containsKey(arr[i])) {
                int Freq=frequencyMap.get(arr[i]);
                Freq++;
                frequencyMap.put(arr[i], Freq);
                arr2[i]=Freq;
            }
            else{
                frequencyMap.put(arr[i],1);
                arr2[i]=1;
            }
        }
        System.out.println(frequencyMap);
        for (int index = 0; index < arr2.length; index++) {

        if (frequencyMap.containsValue(1)) {
            System.out.println(arr2[index]);
        }
        else{
            System.out.println("No element appears once");
        }
    }
    }
}
