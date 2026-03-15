package DoublyLinkedList;

public class DoubLinkedList1 {
    private class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    protected static Node head;
    protected static Node tail;
    public static int size;

    public void adFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
//        newNode.prev = null; // no need, cuz it is by default null
    }

    public void adLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void adInMid(int ind, int data) {
        // step-1: to add at start
        Node newNode = new Node(data);
        size++;
        if (ind == 0){
            if (head == null) {
                head = tail = newNode;
                return;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head =newNode;
            }
            return;
        }
        // step-2: to add at last
        if (ind == size) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            return;
        }
        // step-3: to add in mid
        Node temp = head;
        for (int i = 0; i < ind - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Doubly Linked List is empty");
            return;
        }
        if (size == 1) {
            head.next = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
        return;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
        return;
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void print() {
        Node temp = head;
//        System.out.print("null<->");
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubLinkedList1 dll = new DoubLinkedList1();
//        dll.adFirst(10);
//        dll.adFirst(20);
//        dll.adFirst(30);
//        dll.adFirst(40);
//        dll.print();

        dll.adLast(10);
        dll.adLast(20);
        dll.adLast(30);
        dll.adLast(40);
        dll.print();
        System.out.println(size);
//        dll.adInMid(2, 80);
//        dll.print();
//        dll.removeFirst();
//        dll.print();
//        dll.removeLast();
//        dll.print();
//        System.out.println(size);
        dll.reverse();
        dll.print();
    }
}
