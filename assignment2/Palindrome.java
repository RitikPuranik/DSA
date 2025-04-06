package assignment2;

public class Palindrome {
    public static void main(String[] args) {
        int []arr={1,2,3,2,1};
        int a=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[arr.length-1-i]){
                a++;
            }  
        }
        if (a==1) {
            System.out.println("the given array is not an palindrome");
            
        }
        else{
            System.out.println("The given array is an palindrome");
        }
    }
}
