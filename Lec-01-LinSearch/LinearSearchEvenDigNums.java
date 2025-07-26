// package Lec-01-LinSearch;

public class LinearSearchEvenDigNums {
    public static void main(String[] args) {
        int[] arr = {12, 3451, 21, 6, 7896};
        System.out.println(findNums(arr));
    }
    static int findNums (int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even (int nums) {
        int digitsOfNum = digits(nums);
        return  digitsOfNum % 2 == 0;
    }
    static int digits (int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}

