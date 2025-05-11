package JAVA;

public class ArmstrongPrint {
    public static void main(String[] args) {
        for(int i = 1; i <= 1000; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                int rem = temp % 10;
                sum += rem * rem * rem;
                temp = temp / 10;
            }
            if (i == sum) {
                System.out.print(i + " ");
            }
        }
    }
}
