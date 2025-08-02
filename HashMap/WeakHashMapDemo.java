package HashMap;

import java.util.*;

public class WeakHashMapDemo {
    public static void main(String[] args) throws Exception {
        WeakHashMap<temp, String> m = new WeakHashMap<>();
        temp t = new temp();
        m.put(t, "Java");

        System.out.println("Before GC: " + m);

        t = null;                // Remove strong reference
        System.gc();            // Request GC
        Thread.sleep(500);      // Give GC time to finalize

        System.out.println("After GC: " + m);
    }
}

class temp {
    public String toString() {
        return "temp";
    }

    protected void finalize() {
        System.out.println("finalize() method called");
    }
}
