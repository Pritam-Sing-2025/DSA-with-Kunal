package SinglyLinkedList;

public class FindAndRemNthNode {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head;
    public Node tail;
    public int size;

    public void adFirst(int data) {
        // This is step-1: create new node
        Node newNode = new Node(data);
        size++;
        // If no node in list
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // This is step-2: newNode's next points to the head
        newNode.next = head;
        // This is step-3: assign head to the newNode
        head = newNode;
    }

    public void findRem(int n) {
        size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
//        System.out.println(size);
        if (n == size) {
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
//        return;
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        FindAndRemNthNode ll = new FindAndRemNthNode();
        ll.adFirst(10);
        ll.adFirst(20);
        ll.adFirst(30);
        ll.adFirst(40);
        ll.print();
        ll.findRem(30);
        ll.print();
    }
}
