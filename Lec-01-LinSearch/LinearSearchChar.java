// package Lec-01-LinSearch;

public class LinearSearchChar {
    static String linearSearch (String str, char target) {
        if (str.length() == 0) {
            return "Empty string.";
        }
        for (int i = 0; i < str.length() -1; i++) {
            if (str.charAt(i) == target) {
                return "Found at:" + i;
            }
        }
        return "Not found";
    }
    public static void main(String[] args) {
        String str = "With great responsiblity comes great power";
        char target = 'b';
        String ans = linearSearch(str, target);
        System.out.println(ans);
    }
}

