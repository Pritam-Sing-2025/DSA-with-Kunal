package pritam;

import java.util.ArrayList;

public class Recursion2 {

//    // Check if array is Sorted
//    public static void main(String[] args) {
//        int[] arr = {2, 4, 5, 8, 9,};
//        System.out.println(isSorted(arr, 0));
//    }
//    static boolean isSorted (int[] arr, int index) {
//        if (index == arr.length - 1) {
//            return true;
//        }
//        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
//    }

//    // Linear Search with Recursion
//    public static void main(String[] args) {
//        int[] arr = {3, 86, 22, 18, 49, 9, 35};
//        int target = 49;
//        System.out.println(lSearch(arr, target, 0));
//    }
//    static boolean lSearch(int[] arr, int target, int index) {
//        if (index == arr.length) {
//            return false;
//        }
//        return arr[index] == target || lSearch(arr, target, index + 1);
//    }
////    static int lSearch(int[] arr, int target, int index) {
////        if (index == arr.length) {
////            return - 1;
////        }
////        if (arr[index] == target) {
////            return index;
////        }
////        return lSearch(arr, target, index + 1);
////    }

//    // Find all occurrence of a number
//    public static void main(String[] args) {
//        int[] arr = {3, 24, 18, 20, 24, 9, 24};
//        lSearchAllOccur(arr, 24, 0);
//        System.out.println(list);
//    }
//    static ArrayList<Integer> list = new ArrayList();
//    static void lSearchAllOccur(int[] arr, int target, int index) {
//        if (index == arr.length) {
//            return;
//        }
//        if (arr[index] == target) {
//            list.add(index);
//        }
//        lSearchAllOccur(arr, target, index + 1);
//    }

//    // Find all occurrence of a number by ArrayList as return type
//    public static void main(String[] args) {
//        int[] arr = {3, 24, 18, 20, 24, 9, 24};
//        System.out.println(lSearchAllOccur(arr, 24, 0, new ArrayList<>()));;
//    }
//    static ArrayList<Integer> lSearchAllOccur (int[] arr, int target, int index, ArrayList<Integer> list) {
//        if (index == arr.length) {
//            return list;
//        }
//        if (arr[index] == target) {
//            list.add(index);
//        }
//        return lSearchAllOccur(arr, target, index + 1, list);
//    }

//    // Find all occurrence of a number by ArrayList as return type but not taking list as an argument
//    // It's not an optimized code, u're creating objects again & again for each function call
//    // so don't use this approach, just go for the one above it
//    public static void main(String[] args) {
//        int[] arr = {3, 24, 18, 20, 24, 9, 24};
//        System.out.println(lSearchAllOccur(arr, 24, 0));
//    }
//    static ArrayList<Integer> lSearchAllOccur(int[] arr, int target, int index) {
//    ArrayList<Integer> list = new ArrayList<>();
//        if (index == arr.length) {
//            return list;
//        }
//        if (arr[index] == target) {
//            list.add(index);
//        }
//        ArrayList<Integer> ansFromBelowCalls = lSearchAllOccur(arr, target, index + 1);
//        list.addAll(ansFromBelowCalls);
//        return list;
//    }

//    // Search in rotated sorted array (binary search problem)
//    public static void main(String[] args) {
//        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
//        System.out.println(search(arr, 2, 0, arr.length - 1));
//    }
//    static int search(int[] arr, int target, int st, int end) {
//        if (st > end) {
//            return -1;
//        }
//        int mid = st + (end - st) / 2;
//        if (arr[mid] == target) {
//            return mid;
//        }
//        if (arr[st] <= arr[mid]) {
//            if (target >= arr[st] && target <= arr[mid]) {
//                return search(arr, target, st, mid - 1);
//            }
//            return search(arr, target, mid + 1, end);
//        }
//        if (target >= arr[mid] && target <= arr[end]) {
//            return search(arr, target, mid + 1, end);
//        }
//        return search(arr, target, st, mid - 1);
//    }

}
