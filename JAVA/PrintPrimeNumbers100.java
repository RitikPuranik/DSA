package JAVA;

public class PrintPrimeNumbers100 {
    public static void main(String[] args) {
        System.out.print("Prime numbers between 1 to 100 are:  ");
        int arr[]=new int[100];
        int left=0;
        for(int i=2;i<=100;i++){
            int count=1;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count=0;
                    break;
                }
            }
            if(count==1){
                System.out.print(i+" ");
                arr[left]=i;
                left++;
            }
        }
    }
}
