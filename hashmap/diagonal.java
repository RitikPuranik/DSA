package hashmap;

import java.util.HashMap;
import java.util.Scanner;
public class diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("enter the elements: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(i==j){
                    if(arr[i][j]==1){
                        System.out.println("true");
                    }
                    else{
                        System.out.println("false");
                    }
                }
            }
        }
        
    }
}

