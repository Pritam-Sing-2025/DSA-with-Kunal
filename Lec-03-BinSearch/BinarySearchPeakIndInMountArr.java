class BinarySearchPeakIndInMountArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 6, 3, 2};
        System.out.println(binarySearch(arr));
    }
    static int binarySearch (int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) { //cuz condition violates when start = end & then u get answer
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid; //cuz u're in descending part & mid can be the answer
            } else {
                start = mid + 1;
            }
        }
        return start; // return end //cuz both start & end will point to same number
    }
}