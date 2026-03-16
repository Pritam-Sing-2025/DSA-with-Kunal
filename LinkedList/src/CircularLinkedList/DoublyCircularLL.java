package CircularLinkedList;

import DoublyLinkedList.DoubLinkedList1;

public class DoublyCircularLL {
    private class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private Node prev;
    public int size;

    public void adFirst (int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        newNode.prev = tail;
        tail.next = newNode;
        head = newNode;
    }

    public void adLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        newNode.next = head;
        head.prev = newNode;
        tail = newNode;
    }

    public void adMid(int ind, int data) {
        Node newNode = new Node(data);
        if (ind == 0){
            adFirst(data);
            return;
        }
        if (ind == size) {
            adLast(data);
            return;
        }
        Node prevNode = head;
        int i = 0;
        while (i < ind - 1) {
            prevNode = prevNode.next;
            i++;
        }
        newNode.prev = prevNode;
        newNode.next = prevNode.next;
        prevNode.next.prev = newNode;
        prevNode.next = newNode;
        size++;
    }

    public void remFirst() {
        if (head == null) {
            System.out.println("lisyt is empty");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        head = head.next;
        size--;
        head.prev = tail;
        tail.next = head;
    }

    

    public void print() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("HEAD");
    }

    public static void main(String[] args) {
        DoublyCircularLL dcll = new DoublyCircularLL();
        dcll.adFirst(10);
        dcll.adFirst(20);
        dcll.adFirst(30);
        dcll.adFirst(40);
        dcll.print();
        System.out.println(dcll.size);
        dcll.adLast(50);
        dcll.print();
        System.out.println(dcll.size);
        dcll.adMid(2, 25);
        dcll.print();
        System.out.println(dcll.size);
        dcll.remFirst();
        dcll.print();
        System.out.println(dcll.size);
    }
 }
