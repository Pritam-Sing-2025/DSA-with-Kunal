// package Lec-01-LinSearch;

import java.util.Arrays;

public class LinearSearchIn2DArr {
    static int[] linearSearch (int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
    public static void main(String[] args) {
        int[][] arr = {
            {21, 57, 40},
            {93, 61, 12, 36},
            {85, 10}
        };
        int target = 12;
        int[] ans = linearSearch(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}

