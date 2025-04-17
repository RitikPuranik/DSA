package hashmap;
import java.util.HashMap;
import java.util.Scanner;

public class Common_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array 1");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("enter the elements of array 1");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter the size of array 2");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("enter the elements of array 2");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr1[i]==arr2[j]){
                    map.put(arr1[i],1);
                }
            }
        }
        System.out.println(map);
    }
}
