package JAVA;

public class PrintAlternatePrimeNumber100 {
    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Alternate Prime Number upto 100 are:");
        boolean flag=true;
        for(int i=2;i<=100;i++){
            if(isPrime(i)){
                if(flag){
                    System.out.print(i+" ");
                }
                flag=!flag;
            }
        }
    }
}
