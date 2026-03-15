package SinglyLinkedList;

public class ZigZag {
    class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    public void zigZag() {
        // step-1: find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // step-2: reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextLeft, nextRight; // temp variables for 3rd step of alternate merging

        // step-3: alternate merging
        while (left != null && right != null) {
            nextLeft = left.next;
            left.next = right;
            nextRight = right.next;
            right.next = nextLeft;

            left = nextLeft;
            right = nextRight;
        }
    }

    public void adFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ZigZag ll = new ZigZag();
        ll.adFirst(6);
        ll.adFirst(5);
        ll.adFirst(4);
        ll.adFirst(3);
        ll.adFirst(2);
        ll.adFirst(1);
        ll.print();
        ll.zigZag();
        ll.print();

    }
}
