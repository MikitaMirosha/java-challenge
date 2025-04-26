/*
Given a string s containing just the characters
'(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

Example 1:

Input: s = "()"
Output: true

Example 2:

Input: s = "()[]{}"
Output: true

Example 3:

Input: s = "(]"
Output: false

Example 4:

Input: s = "([])"
Output: true

Constraints:

    1 <= s.length <= 104
    s consists of parentheses only '()[]{}'.
*/

package _3;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        boolean result = isValid("{([])}");
        System.out.println(result);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            if (cur == '{' || cur == '[' || cur == '(') {
                stack.push(cur);
                continue;
            }

            if (!stack.isEmpty()) {
                char top = stack.peek();

                if (cur == '}' && top == '{') {
                    stack.pop();
                } else if (cur == ']' && top == '[') {
                    stack.pop();
                } else if (cur == ')' && top == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    // Time complexity: O(N)
    // Memory complexity: O(N)
}
