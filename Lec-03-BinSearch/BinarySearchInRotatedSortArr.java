public class BinarySearchInRotatedSortArr {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 0, 1, 2};
        int target = 1;
        System.out.println(search(arr, target));
    }
    static int search (int[] arr, int target) {
        int pivot = findPivot(arr);
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length -1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot -1);
        } 
        return binarySearch(arr, target, pivot + 1, arr.length -1);
    }
    static int findPivot (int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1] && mid < end) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1] && mid > start) {
                return mid -1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int binarySearch (int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
