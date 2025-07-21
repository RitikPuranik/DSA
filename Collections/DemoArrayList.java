import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;
public class DemoArrayList {
    public static void main(String[] args) {

        ArrayList <Object>al = new ArrayList<>();
    
        System.out.println(al instanceof Cloneable);
        System.out.println(al instanceof Serializable);
        System.out.println(al instanceof RandomAccess);

    }
}