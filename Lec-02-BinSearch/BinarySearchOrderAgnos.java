// package Lec-02-BinSearch;

public class BinarySearchOrderAgnos {
    public static void main(String[] args) {
        // int[] arr = {13, 36, 40, 49, 75, 83, 91};
        int[] arr = {91, 83, 75, 49, 40, 36, 13};
        int target = 75;
        System.out.println(binarySearch(arr, target));

    }
    static int binarySearch (int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

