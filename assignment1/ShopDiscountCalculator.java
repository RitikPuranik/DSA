package assignment1;

import java.util.Scanner;
public class ShopDiscountCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the total cost of items(in $)");
        int price=sc.nextInt();

        System.out.println("enter the number of items");
        int items=sc.nextInt();
         
        if (price>100&&items>=5) {
            System.out.println("discount applied is 10%");
            double cost=price-(price/10);
            System.out.println("the amount to pay is :"+cost+"$");
        }
        else if (price>=50&&price<=100) {
            System.out.println("discount applied is 5%");
            double cost=price-(price/20);
            System.out.println("the amount to pay is :"+cost+"$");
            
        } else {
            System.out.println("no discount is applied");
            
        }
        System.out.println("thanks for shopping");

    }
    
}
