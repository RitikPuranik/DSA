package JAVA;

public class PerfectNmber100 {
    static int factorSum(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum; 
    }

    static boolean isPerfect(int n){
        if(factorSum(n)==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("The perfect numbers are from 1 to 100 : ");
        for(int i=1;i<=100;i++){
            if(isPerfect(i)){
                System.out.print(i+" ");
            }
        }
    }
}
