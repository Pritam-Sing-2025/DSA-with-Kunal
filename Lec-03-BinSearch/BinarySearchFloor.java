public class BinarySearchFloor {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 12, 13, 16, 21, 26};
        int target = 217;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch (int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        if (target < arr[start]) {
            return -1;
        }
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
        return arr[end];
    }
}
