// package Lec-01-LinSearch;

public class LinearSearchInRange {
    static int linearSearch (int[] arr, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {32, 78, 24, 32, 26, 10, 51, 87, 32};
        int target = 32;
        int ans = linearSearch(arr, target, 2, 6);
        System.out.println(ans);
    }
}

