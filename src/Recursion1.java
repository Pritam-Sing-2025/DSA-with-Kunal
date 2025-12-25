public class Recursion1 {

//    // printing numbers
//    public static void main(String[] args) {
//        fun(5);
//    }
//    public static void fun (int n) {
//        if (n == 0) {
//            return;
//        }
//        System.out.println(n); //prints 5 to 1
//        fun(n - 1);
//        System.out.println(n);   //prints 1 to 5
//    }

//    // Factorial
//    public static void main(String[] args) {
//        System.out.println(fact(5));
//    }
//    public static int fact(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        return n * (fact(n - 1));
//    }

//    // Sum of n to 1 numbers
//    public static void main(String[] args) {
//        System.out.println(sum(5));
//    }
//    public static int sum (int n) {
//        if (n == 1) {
//            return 1;
//        }
//        return n + sum(n - 1);
//    }

//    // Sum of digits of number n
//    public static void main(String[] args) {
//        System.out.println(sum(1342));
//    }
//    public static int sum (int n) {
//        if (n == 0) {
//            return 0;
//        }
//        return (n % 10) + sum(n / 10);
//    }

//    // Product of digits of n
//    public static void main(String[] args) {
//        int ans = prod(3422);
//        System.out.println(ans);
//    }
//    public static int prod(int n) {
//        if (n == 0) {
//            return 1;
//        }
//        // OR (kunal's way)
//        // if (n % 10 == n) {
//        //     return n;
//        // }
//        return (n % 10) * prod(n / 10);
//    }

//    // Passing numbers n to 1
//    public static void main(String[] args) {
//        passNums(5);
//    }
//    public static void passNums(int n) {
//        if (n == 0) {
////            System.out.println();
//            return;
//        }
////        System.out.println(n);
////        passNums(n--); // stack overflow
//        System.out.println(n);
//        passNums(--n);
//    }

    // Reversing a number way-1
//    public static void main(String[] args) {
//        rev(4283);
//        System.out.println(sum);
//    }
//    static int sum = 0;
//    static void rev (int n) {
//        if (n == 0) {
//            return;
//        }
//        int rem = n % 10;
//        sum = sum * 10 + rem;
//        rev(n / 10);
//    }

//    // Reversing a number way-2
//    public static void main(String[] args) {
//        System.out.println(rev(4283));
//    }
//    static int rev (int n) {
//        int digits = (int) (Math.log10(n)) + 1;
//        return helper(n, digits);
//    }
//     static int helper (int n, int digits) {
//        if (n % 10 == n) {
//            return n;
//        }
//        int rem = n % 10;
//        return rem * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
//    }

//    // Pallindrome number
//    public static void main(String[] args) {
//        System.out.println(isPallindrome(1234321));
//    }
//    static int rev (int n) {
//        int digits = (int) (Math.log10(n)) + 1;
//        return helper(n, digits);
//    }
//    static int helper (int n, int digits) {
//        if (n % 10 == n) {
//            return n;
//        }
//        int rem = n % 10;
//        return rem * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
//    }
//    static boolean isPallindrome (int n) {
//        return n == rev(n);
//    }

//    // Count number of zeros in a number
//    public static void main(String[] args) {
//        System.out.println(count(203401));
//    }
//    static int count (int n) {
//        return helper(n, 0);
//    }
//    static int helper (int n, int count) {
//        if (n == 0) {
//            return count;
//        }
//        int rem = n % 10;
//        if (rem == 0) {
//            return helper(n / 10, count + 1);
//        }
//        return helper(n / 10, count);
//    }

//    // Count number of steps
//    public static void main(String[] args) {
//        System.out.println(count(14));
//    }
//    static int count(int n) {
//        return helper(n, 0);
//    }
//    static int helper(int n, int step) {
//        if (n == 0) {
//            return step;
//        }
//        if (n % 2 == 0) {
//            return helper(n / 2, step + 1);
//        }
//        return helper(n - 1, step + 1);
//    }

    // Number of Steps to Reduce a Number to Zero (Leetcode)
    public static void main(String[] args) {
        System.out.println(count(14));
    }
    static int count (int num) {
        return helper(num, 0);
    }
    static int helper(int num, int steps) {
        if(num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return helper(num/2, steps+1);
        }
        return helper(num-1, steps+1);
    }


}
