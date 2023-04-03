package Easy.PalindromeNumber;

class Solution {
    public boolean isPalindrome(int x) {
        String res = String.valueOf(x);
        while (res.length() > 1) {
            if (res.indexOf(res.charAt(0)) != res.indexOf(res.charAt(res.length() - 1))) {
                return false;
            }
            res = res.substring(1, res.length() - 1);
        }
        return true;
    }

}
