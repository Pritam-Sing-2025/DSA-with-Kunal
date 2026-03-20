import java.util.Stack;

public class ReverseString {
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int ind = 0;
        while (ind < str.length()) {
            s.push(str.charAt(ind));
            ind++;
        }
        StringBuilder sb = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            sb.append(curr);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Pritam";
        String ans = reverseString(str);
        System.out.println(ans);
    }
}
