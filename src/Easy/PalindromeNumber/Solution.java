package Easy.PalindromeNumber;

class Solution {
    public boolean isPalindrome(int x) {
        int convertNumber = 0;
        int temp = x;
        if (x % 10 == x && x > 0) {
            return true;
        }
        while (temp > 0) {
            convertNumber = convertNumber * 10 + (temp % 10);
            temp /= 10;
        }
        return x == convertNumber;
    }

}
