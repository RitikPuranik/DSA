package JAVA;

public class ArmstrongPrint {
    static int countDigits(int n){
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    static int sum(int n){
        int sum=0;
        int c=countDigits(n);
        while (n>0) {
            int dig=n%10;
            sum=sum+(int)Math.pow(dig,c);
            n=n/10;
        }
        return sum;
    }
    static boolean isArmstrong(int n){
        int sum=sum(n);
        if (n==sum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.print(" Armstrong number between 1 to 1000 are : ");
        for(int i = 1; i <= 1000; i++) {
            if(isArmstrong(i)){
                System.out.print(i +" ");
            }
        }
    }
}
