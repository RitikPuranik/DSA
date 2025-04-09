package array_leetcode_easy;

import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of kids");
        int k=sc.nextInt();
        int []candies=new int[k];
        System.out.println("enter the number of candies per kid");
        for(int i=0;i<k;i++){
            candies[i]=sc.nextInt();
        }
        System.out.println("enter the number of extra candies");
        int extracandies=sc.nextInt();
        int count=0;
        for(int i=0;i<k;i++){
            candies[i]=candies[i]+extracandies;
            for(int j=0;j<k;j++){
                if(candies[i]>=candies[j]){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count>1){
                System.out.print("true ");
            }
            else{
                System.out.print("false ");
            }
            count=0;
        }
    }
}
