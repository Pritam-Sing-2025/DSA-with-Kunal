import java.util.Stack;

public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop(); // remove top one by one
        pushAtBottom(s, data); // push at the bottom
        s.push(top); // push (popped ones) one by one
    }
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return; // cuz an empty stack is already a reversed stack.
        }
        int top = s.pop(); // remove top one by one
        reverseStack(s); // calling next level
        pushAtBottom(s, top); // push each popped at bottom one by one

    }
    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        reverseStack(s);
        printStack(s);
    }
}
