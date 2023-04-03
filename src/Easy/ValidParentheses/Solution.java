package Easy.ValidParentheses;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> leftSymbols = new Stack<>();
        for (char symbol : s.toCharArray()) {
            if (symbol == '(' || symbol == '{' || symbol == '[') {
                leftSymbols.push(symbol);
            } else if (!leftSymbols.isEmpty()) {
                if (symbol - 1 == leftSymbols.peek() || symbol - 2 == leftSymbols.peek())
                    leftSymbols.pop();
                else
                    return false;
            } else
                return false;
        }
        return leftSymbols.isEmpty();
    }
}

