package Easy.ValidPalindrome;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder temp = new StringBuilder();
        if (s.length() == 1) return true;
        for (int i = s.length() - 1; i > 0; i--) {
            temp.append(s.charAt(i));
            s = s.substring(0, i);
            if (s.length() <= temp.length())
                break;
        }
        return s.contentEquals(temp) || s.contentEquals(temp.substring(0, temp.length() - 1));
    }
}