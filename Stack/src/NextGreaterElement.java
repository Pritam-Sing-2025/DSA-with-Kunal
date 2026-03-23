import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {

        // Next greatest (right side)
        int[] arr = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int[] nextGreater = new int[arr.length];
        // Start from the last (backward traversal)
        for (int i = arr.length - 1; i >= 0; i--) {
            // step-1
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // step-2
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            // step-3
            s.push(i);
        }
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();


//        // Previous greatest (left side)
//        int[] arr = {6, 8, 0, 1, 3};
//        Stack<Integer> s = new Stack<>();
//        int[] nextGreater = new int[arr.length];
//        // Start from the first
//        for (int i = 0; i < arr.length; i++) {
//            // step-1
//            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
//                s.pop();
//            }
//            // step-2
//            if (s.isEmpty()) {
//                nextGreater[i] = -1;
//            } else {
//                nextGreater[i] = arr[s.peek()];
//            }
//            // step-3
//            s.push(i);
//        }
//        for (int i = 0; i < nextGreater.length; i++) {
//            System.out.print(nextGreater[i] + " ");
//        }
//        System.out.println();


//        // Next smallest (right side)
//        int[] arr = {6, 8, 0, 1, 3};
//        Stack<Integer> s = new Stack<>();
//        int[] nextGreater = new int[arr.length];
//        // Start from last (backward traversal)
//        for (int i = arr.length - 1; i >= 0; i--) {
//            // step-1
//            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
//                s.pop();
//            }
//            // step-2
//            if (s.isEmpty()) {
//                nextGreater[i] = -1;
//            } else {
//                nextGreater[i] = arr[s.peek()];
//            }
//            // step-3
//            s.push(i);
//        }
//        for (int i = 0; i < nextGreater.length; i++) {
//            System.out.print(nextGreater[i] + " ");
//        }
//        System.out.println();


//        // Previous smallest (left side)
//        int[] arr = {6, 8, 0, 1, 3};
//        Stack<Integer> s = new Stack<>();
//        int[] nextGreater = new int[arr.length];
//        // Start from the first
//        for (int i = 0; i < arr.length; i++) {
//            // step-1
//            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
//                s.pop();
//            }
//            // step-2
//            if (s.isEmpty()) {
//                nextGreater[i] = -1;
//            } else {
//                nextGreater[i] = arr[s.peek()];
//            }
//            // step-3
//            s.push(i);
//        }
//        for (int i = 0; i < nextGreater.length; i++) {
//            System.out.print(nextGreater[i] + " ");
//        }
//        System.out.println();
    }
}
