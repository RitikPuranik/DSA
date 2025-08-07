package assignment2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

class CommonElementsBeetweenArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array 1:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array 1:");
        int []arr1=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element at position"+(i+1));
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of array 2:");
        int m=sc.nextInt();
        System.out.println("Enter the elements of array 2:");
        int []arr2=new int[m];
        System.out.println("Enter the elements of array 2:");
        for(int i=0;i<m;i++){
            System.out.println("Enter the element at position "+(i+1));
            arr2[i]=sc.nextInt();
        }
        ArrayList<Integer> al=intersect(arr1,arr2);
        System.out.println("Common Elements are :");
        for(int i:al){
            System.out.print(i+" ");
        }
        sc.close();
    }
    static ArrayList<Integer>  intersect(int[] arr1,int[] arr2){
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();

        for(int i:arr1){
            hs1.add(i);
        }
        for(int i:arr2){
            hs2.add(i);
        }
        

        ArrayList<Integer> al=new ArrayList<>();
        for(int i : hs1){
            if(hs2.contains(i)){
                al.add(i);
            }
        }
        return al;
    }

}