import javax.sound.sampled.Line;

public class StackUsingLList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Stack {
        static Node head = null;


        static boolean isEmpty() {
            return head == null;
        }
        static void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        StackUsingAList.Stack s = new StackUsingAList.Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }


}
