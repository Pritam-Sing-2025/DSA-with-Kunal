class BinarySearchFirstLastOccur {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 9};
        int target = 7;
    }
    static int[] searchRange (int[] arr, int target) {
        int[] ans = {-1, -1};
        int start = binarySearch(arr, target, true); // first index
        int end = binarySearch(arr, target, false); // last index
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int binarySearch (int[] arr, int target, boolean firstIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid; // mid can be possible answer ,but
                if (firstIndex) { // 1st occurence can lie on left side
                    end = mid - 1;
                } else { // last index can lieon right side
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}