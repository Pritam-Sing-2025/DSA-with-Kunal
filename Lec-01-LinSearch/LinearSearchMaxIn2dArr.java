// package Lec-01-LinSearch;

public class LinearSearchMaxIn2dArr {
    public static void main(String[] args) {
        int[][] arr = {
            {210, 57, 40},
            {93, 61, 12, 36},
            {85, 108}
        };
        int ans = linearSearch(arr);
        System.out.println(ans);
    }
    static int linearSearch (int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            
        }
        return max;
    }
}

