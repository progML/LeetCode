package Easy.PalindromeNumber;

class Solution {
    public boolean isPalindrome(int x) {
        int revertNumber = 0;
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        while (x > revertNumber) {
            revertNumber = revertNumber * 10 + (x % 10);
            x /= 10;
        }
        return x == revertNumber || x == revertNumber / 10;
    }

}
