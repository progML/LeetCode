package Easy.ValidParentheses;

class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        while (s.length() > 1) {
            if (s.charAt(0) != s.charAt(s.length() - 1)) {
                return false;
            } else
                s = s.substring(1, s.length() - 1);
        }
        return true;
    }
}