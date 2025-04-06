package assignment2;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int [] arrr= new int[arr.length];
        for(int i=arr.length-1;i<=0;i++){
            arr[i]=arrr[i];
            System.out.println(arrr[i]);
        }
    }
}
