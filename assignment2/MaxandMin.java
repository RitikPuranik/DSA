package assignment2;

public class MaxandMin {
    public static void main(String[] args) {
        int []arr={3,1,4,1,5,9,2,10};
        int max=0;
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];
                
            }
        }
        System.out.println(max);
        for(int i=0;i<arr.length;i++){
            if (arr[i] < min) {
                min=arr[i];
                
            }
        }
        System.out.println(min);
    }
    
}