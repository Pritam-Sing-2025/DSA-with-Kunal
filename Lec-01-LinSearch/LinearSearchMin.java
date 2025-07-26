// package Lec-01-LinSearch;

public class LinearSearchMin {
    static int linearSearch (int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {32, -78, 24, -32, 26, 10, 51, 87, 62};
        System.out.println(linearSearch(arr));
    }
}

