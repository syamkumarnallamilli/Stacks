import java.util.Iterator;
import java.util.Stack;

public class Create {
    public static void main(String[] args) {
        // Create an Object for Stack
        Stack<Integer> stack = new Stack<>();

        // Load Values into the Stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // Iterate over the Stack using Iterator and While loop
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}