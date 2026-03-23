import java.util.Stack;
public class DuplicateParantheses {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // duplicate
                } else {
                    s.pop(); // remove opening pair
                }
            }
            // opening, operand, operator
            else {
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "(a + ((b) * (a + b)))";
        String str2 = "((a + b) + ((b + c)))";
        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }
}
