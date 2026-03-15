package SinglyLinkedList;

public class MergeSort {
    static class Nodee {
        int data;
        Nodee next;
        Nodee (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Nodee head;
    public static Nodee tail;

    public Nodee midNode(Nodee head) {
        Nodee slow = head;
        Nodee fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Nodee merge(Nodee rightHead, Nodee leftHead) {
        Nodee mergedLL = new Nodee(-1);
        Nodee temp = mergedLL;
        while (leftHead != null && rightHead != null) {
            if (leftHead.data <= rightHead.data) {
                temp.next = leftHead;
                leftHead = leftHead.next;
                temp = temp.next;
            } else {
                temp.next = rightHead;
                rightHead = rightHead.next;
                temp = temp.next;
            }
        }
        while (leftHead != null) {
            temp.next = leftHead;
            leftHead = leftHead.next;
            temp = temp.next;
        }
        while (rightHead != null) {
            temp.next = rightHead;
            rightHead = rightHead.next;
            temp = temp.next;
        }
        return mergedLL.next; // cuz -1 is stored at head in mergedLL, so mergedLL.next
    }

    public Nodee mergeSort(Nodee head) {
        if (head == null || head.next == null) {
            return head;
        }
        Nodee mid = midNode(head);
        Nodee rightHead = mid.next;
        mid.next = null;
        Nodee newLeft = mergeSort(head);
        Nodee newRight = mergeSort(rightHead);
        return merge(newLeft, newRight);
    }

    public void adFirst(int data) {
        Nodee newNode = new Nodee(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Nodee temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MergeSort ll = new MergeSort();
//        head = new Nodee(5);
//        head.next = new Nodee(4);
//        head.next.next = new Nodee(3);
//        head.next.next.next = new Nodee(2);
//        head.next.next.next.next = new Nodee(1);
        ll.adFirst(1);
        ll.adFirst(2);
        ll.adFirst(3);
        ll.adFirst(4);
        ll.adFirst(5);
        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
    }
}
