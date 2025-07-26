// package Lec-03-BinSearch;

public class BinarySearchCeil {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 12, 13, 16, 21, 26};
        int target = -27;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch (int[] arr, int target) {
        if (target > arr[arr.length -1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        // if (target > arr[end]) {
        //     return arr[end];
        // }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
