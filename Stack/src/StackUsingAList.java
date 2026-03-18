import java.util.ArrayList;
public class StackUsingAList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty() {
//        if (list.size() == 0) {
//            return true;
//        }
//        return false;
            return list.size() == 0;
        }
        public static void push(int data) {
            list.add(data);
        }
        public static int pop() {
            int top = list.get(list.size() - 1); // get() works in O(1) time
            list.remove(list.size() - 1); // remove() also works in O(1) time
            return top;
        }
        public static int peek() {
            return list.get(list.size() - 1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
