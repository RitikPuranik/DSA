
package assignment1;

public class GeneratePythagoreanTriples {
    public static void main(String[] args) {
        int limit =100;
        for(int a=1;a<limit;a++){
            for(int b=2;b<limit;b++){
                for(int c=3;c<limit;c++){
                    if(a<b && b<c){
                        if(a*a + b*b == c*c){
                           System.out.println(a+","+b+","+c+"is pythagorean triplet"); 
                        }
                    }
                }
            }
        }
    }
}