package SinglyLinkedList;

public class IsCycle {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        IsCycle ll = new IsCycle();
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
//        head.next.next.next = head;
        System.out.println(ll.isCycle());
    }
}
