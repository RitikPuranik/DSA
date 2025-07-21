import java.util.*;

public class EnumerationVector {
    public static void main(String[] args) {
        Vector <Object> v= new Vector<>();
        for(int i=1;i<=10;i++){
            v.addElement(i);
        }
        System.out.println(v);

        Enumeration<Object> e = v.elements();
        while(e.hasMoreElements()){
            Integer i=(Integer)e.nextElement();

            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println(v);
    }
}
