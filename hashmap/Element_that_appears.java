package hashmap;
import java.util.HashMap;
import java.util.Scanner;
public class Element_that_appears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();}
        HashMap<Integer ,Integer> frequencymap =new HashMap<>();
        
        for(int i=0;i<n;i++){
            if(frequencymap.containsKey(arr[i])){
                int Freq=frequencymap.get(arr[i]);
                  Freq++;
                frequencymap.put(arr[i],Freq);
            }
            else{

                frequencymap.put(arr[i], 1);
            }
        }
        System.out.println(frequencymap);
        for (int i = 0; i < n; i++) {
            if (frequencymap.get(arr[i]) == 1) {
                System.out.println(" non-repeating number is: " + arr[i]);
               break;
            }
        }
        
    }
}
