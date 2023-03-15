package Easy.LengthofLastWord;

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.strip();
        if (s.contains(" "))
            return s.substring(s.lastIndexOf(" "), s.length() - 1).length();
        else
            return s.length();
    }
}