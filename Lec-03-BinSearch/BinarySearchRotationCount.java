public class BinarySearchRotationCount {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(arr));
    }
    static int search (int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }
    static int findPivot (int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1] && mid < end) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1] && mid > start) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1; 
            }
            if (arr[end] > arr[mid]) {
                start = mid + 1;
            }
        }
        return - 1;
    }
}
