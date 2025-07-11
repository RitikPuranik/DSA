
import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.empty());

        s.push("A");
        s.push("B");
        s.push("C");

        System.out.println(s.empty());
        System.out.println(s);
        s.pop();

        System.out.println(s);
        System.out.println(s.peek());

    }
}
