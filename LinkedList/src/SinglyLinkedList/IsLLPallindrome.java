package SinglyLinkedList;

public class IsLLPallindrome {
    class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head;
    public Node tail;
    public void adFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public Node midNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPaindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node mid = midNode(head);
        Node curr = mid;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        IsLLPallindrome ll = new IsLLPallindrome();
        ll.adFirst(1);
        ll.adFirst(2);
        ll.adFirst(2);
        ll.adFirst(1);
        System.out.println(ll.isPaindrome());
    }
}
