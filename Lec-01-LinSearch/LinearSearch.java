// package Lec-01-LinSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {14, 53, 32, 29, 60, 70, 38};
        int target = 29;
        System.out.println(linearSearch(arr, target));
    }
    static int linearSearch (int []arr, int target) {
        // if (arr.length == 0) {
        //     return -1;
        // }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
