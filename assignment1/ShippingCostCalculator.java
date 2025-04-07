package assignment1;

import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input the weight of the package(in pounds) :");
        int weight=sc.nextInt();

        System.out.println("enter the distance to be shipped(in miles) :");
        int distance=sc.nextInt();

        if (weight<=10 && distance<=100) {
            System.out.println("The cost is 5$");
        }
        else if (weight>10 && weight<=20 && distance>100 && distance<=500) {
            System.out.println("The cost is 10$");
        }
        else{
            System.out.println("The cost is 20$");
        }
        System.out.println("THANK YOU!!!");
        sc.close();
    }
    
}
