import java.util.Scanner;

public class sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("Enter the elements of first array");
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int arr2[][]=new int[n][m];
        System.out.println("enter the elements of second array");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=arr[i][j]+arr2[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
