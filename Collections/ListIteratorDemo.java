import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList <String>l=new LinkedList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        
        System.out.println(l);

        ListIterator <String>itr=l.listIterator();
        while(itr.hasNext()){
            String s=(String)itr.next();
            if(s.equals("B")){
                itr.remove();
            }
            else if(s.equals("D")){
                itr.add("C");
            }
        }
        System.out.println(l);
    }
}
