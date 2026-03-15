package SinglyLinkedList;

public class LinkedListAddFirst {

    private class Node1 {
        int data;
        Node1 next;

        public Node1(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node1 head;
    public Node1 tail;
    public static int size;

    public void adFirst(int data) {
        // This is step-1: create new node
        Node1 newNode = new Node1(data);
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

    public void adLast(int data) {
        // This is step-1: create new node
        Node1 newNode = new Node1(data);
        size++;
        // If no node in list
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // This is step-2: tail's next point to the newNode
        tail.next = newNode;
        // This is step-3: assign tail to the newNode
        tail = newNode;
    }

    public void addInMiddle(int ind, int data) {

//        if (ind < 0 || ind > size) {
//            throw new IndexOutOfBoundsException("Invalid index");
//        }

        // To add on 1st (0th) index
        if (ind == 0) {
            adFirst(data);
            return;
        }

        // To add on last index
        if (ind == size) {
            adLast(data);
            return;
        }

        Node1 newNode = new Node1(data);
        size++;
        Node1 temp = head;
        int i = 0;
        while (i < ind - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
//            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node1 prev = head;
        for (int i = 0; i < size - 2; i++) { // size - 2, cuz u want second last node.
            prev = prev.next;
        }
        int val = prev.next.data; // or tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public void remMid(int ind) {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }
        if (size == ind - 1) {
            removeLast();
            size--;
            return;
        }
        Node1 prev = head;
        for (int i = 0; i < ind - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        size--;
    }

    // Iterative search
    public int itrSearch(int key) {
        Node1 temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // Recursive search using helper function
    public int helper(Node1 head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int ind = helper(head.next, key);
        if (ind == - 1) {
            return - 1;
        }
        return ind + 1;
    }
    public int recSearch(int key) {
        return helper(head, key);
    }

    // Previous
    public void reverse() {
        Node1 prev = null;
        Node1 curr = tail = head;
        Node1 next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

//    public Node1 findMid() {
//        Node1 slow = head;
//        Node1 fast = head;
//        while (fast != null && fast.next != null) {
//            slow = slow.next; // +1
//            fast = fast.next.next; // +2
//        }
//        return slow;
//    }

    public void print() {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListAddFirst list = new LinkedListAddFirst();
        list.adLast(10);
        list.adLast(20);
        list.adLast(30);
        list.adLast(40);
//        list.print();
//        System.out.println(list.size);
//        list.reverse();
        list.print();
//        System.out.println(list.findMid());
        list.remMid(2);
        list.print();
        System.out.println(list.size);
    }
}
