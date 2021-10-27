import java.util.ArrayDeque;
import java.util.Deque;

public class Solution20 {
    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                deque.push(ch);
                continue;
            }
            if (deque.isEmpty()) return false;

            char check;
            switch (ch) {
                case ')':
                    check = deque.pop();
                    if (check == '{' || check == '[') return false;
                    break;
                case '}':
                    check = deque.pop();
                    if (check == '(' || check == '[') return false;
                    break;
                case ']':
                    check = deque.pop();
                    if (check == '(' || check == '{') return false;
                    break;
            }
        }
        return deque.isEmpty();
    }
}