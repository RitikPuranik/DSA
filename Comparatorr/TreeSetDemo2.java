// import java.util.*;
// import java.util.Comparator;

// class MyComparator1 implements Comparator{
//     public int compare(Object obj1, Object obj2){
//         String s1= (String)obj1;
//         String s2= (String)obj2;
//         return s2.compareTo(s1);

//     }
        
// }
// public class TreeSetDemo2 {
//     public static void main(String[] args) {
//         TreeSet t=new TreeSet(new MyComparator1());
//         t.add("Roja");
//         t.add("Shobha Rani");
//         t.add("Raja Kumari");
//         t.add("Ganga Bhavani");
//         t.add("Raj BHavani");

//         System.out.println(t);
//     }
// }

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator1 implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1); // descending order
    }
}

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>(new MyComparator1());
        
        t.add("Roja");
        t.add("Shobha Rani");
        t.add("Raja Kumari");
        t.add("Ganga Bhavani");
        t.add("Raj BHavani");

        System.out.println(t);
    }
}
