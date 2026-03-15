package SinglyLinkedList;

public class LinkedList1 {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList1(int size) {
        this.size = 0;
    }

    private class Node {

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }
}
