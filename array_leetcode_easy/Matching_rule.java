package array_leetcode_easy;

import java.util.Scanner;

public class Matching_rule {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of items");
        int n=sc.nextInt();

        String[][] arr=new String[n][3];
        System.out.println("enter the values of specifications ");
        System.out.println("1. type");    
        System.out.println("2. color");  
        System.out.println("3. name"); 

        for(int i=0;i<n;i++){
            System.out.println("enter the specifications of "+(i+1)+" item");
            for(int j=0;j<3;j++){ 
            arr[i][j]=sc.nextLine();
            }
        }   

        System.out.println("enter the Rulevlue number");
        System.out.println("specifications are:");
        System.out.println("1. type");    
        System.out.println("2. color");  
        System.out.println("3. name");   
        int rule=sc.nextInt();

        System.out.println("enter the value of rule");
        String rulevalue=sc.next();
        

    }
}
