package CircularLinkedList;

public class SinglyCircularLL {
    private class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    private Node head ;
    private Node tail ;
    private int size;

    public void adFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            tail.next = head; // use head only
//            tail.next = newNode;
            return;

        }
        newNode.next = head;
        tail.next = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void adMid(int ind, int data) {
        if (ind == 0) {
            adFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < ind - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void remFirst() {
        if (size == 0) {
            System.out.println("LL is empty, nothing to remove");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        head = head.next;
        size--;
        tail.next = head;
    }

    public void remLast() {
        if (size == 0) {
            System.out.println("LL is empty, nothing to remove");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
//        prev.next = head;
//        tail = prev;
        tail = prev; // use this only
        tail.next = head;
        size--;
    }

    public void remMid(int ind) {
        if (size == 0) {
            System.out.println("LL is empty, nothing to remove");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        if (ind == size - 1) {
            remLast();
            size--;
            return;
        }
        Node prev = head;
        for (int i = 0; i < ind - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        size--;
    }

    public void print() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            while (temp != head);
        }
        System.out.println("HEAD");
    }

    public static void main(String[] args) {
        SinglyCircularLL cll = new SinglyCircularLL();
        cll.adFirst(40);
        cll.adFirst(30);
        cll.adFirst(20);
        cll.adFirst(10);
        cll.print();
        System.out.println(cll.size);
        cll.addLast(88);
        cll.print();
        System.out.println(cll.size);
        cll.adMid(2, 25);
        cll.print();
        System.out.println(cll.size);
        cll.remFirst();
        cll.print();
        System.out.println(cll.size);
        cll.remLast();
        cll.print();
        System.out.println(cll.size);
        cll.remMid(1);
        cll.print();
        System.out.println(cll.size);
    }
}
