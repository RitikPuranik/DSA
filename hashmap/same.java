package hashmap;
import java.util.HashMap;
import java.util.Scanner;
// import java.util.Map;
public class same {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter number of elements in array");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         int max=0;
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();}
//         HashMap<Integer ,Integer> frequencymap =new HashMap<>();
//         for(int i=0;i<n;i++){
//             if(frequencymap.containsKey(arr[i])){
//                 int Freq=frequencymap.get(arr[i]);
//                   Freq++;
//                 frequencymap.put(arr[i],Freq);
//             }
//             else{

//                 frequencymap.put(arr[i], 1);
//             }
//         }
//         System.out.println(frequencymap);
//     }
// }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of the array:");
    int n = sc.nextInt();

    int[] input = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
        input[i] = sc.nextInt();
    }

    int[] unique = new int[n];
    int[] count = new int[n];

    int index = 0;
    int frequency = 1;

    for (int i = 1; i < n; i++) {
        if (input[i] == input[i - 1]) {
            frequency++;
        } else {
            unique[index] = input[i - 1];
            count[index] = frequency;
            index++;
            frequency = 1;
        }
    }

    // Store last element
    unique[index] = input[n - 1];
    count[index] = frequency;
    index++;

    System.out.println("Element = Frequency:");
    for (int i = 0; i < index; i++) {
        System.out.println(unique[i] + " = " + count[i]);
    }

    sc.close();
}
}