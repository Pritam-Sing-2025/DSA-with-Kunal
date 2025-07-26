// package Lec-01-LinSearch;

public class LinearSearchForRichPerson {
    static int linearSearch (int[][] arr) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 6},
            {2, 4, 5}
        };
        System.out.println(linearSearch(arr));
    }
}

