import java.util.Stack;
public class PushAtTheBottom {
    public static void pushAtTheBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtTheBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        pushAtTheBottom(stack, 4);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
