import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); ++i) {

            char c = s.charAt(i);

            if (map.containsKey(c)){
                char top = stack.empty() ? '#' : stack.pop();

                if (top != map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }

        }
        return stack.isEmpty();
    }

}
/**
 * public boolean isValid(String s) {
 * 	Stack<Character> stack = new Stack<Character>();
 * 	for (char c : s.toCharArray()) {
 * 		if (c == '(')
 * 			stack.push(')');
 * 		else if (c == '{')
 * 			stack.push('}');
 * 		else if (c == '[')
 * 			stack.push(']');
 * 		else if (stack.isEmpty() || stack.pop() != c)
 * 			return false;
 *        }
 * 	return stack.isEmpty();
 * }
 */
