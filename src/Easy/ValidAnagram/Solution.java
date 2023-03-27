package Easy.ValidAnagram;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            for (String symbol : t.split("")) {
                s = s.replaceFirst(symbol, "");
            }
        }
        return s.length() == 0;
    }
}