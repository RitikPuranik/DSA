package hashmap;

public class diagonal_sum {
    public static void main(String[] args) {
        int sum=0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if((i==j)||(i+j)==(mat.length-1)){
                    sum=sum+mat[i][j];
                }
                
                if((i=mat.length/2) == (j=mat.length/2)){
                    sum=sum-mat[i][j];
                }
            }
        }
        return sum;
    }
}
