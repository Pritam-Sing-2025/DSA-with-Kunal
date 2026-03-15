package SinglyLinkedList;

public class RemCycle {
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static boolean isCycle() {
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

    public static void remCycle() {
        // step-1: detect cycle
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycle = true;
                break;
            }
        }
        if (isCycle == false) {
            return;
        }
        // step-2: find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // step-3: remove cycle- last node's next = null
        prev.next = null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        System.out.println(isCycle());
        remCycle();
        System.out.println(isCycle());
    }

}
