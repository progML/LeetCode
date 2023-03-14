package Easy.RomanToInteger;

class Solution {
    public int romanToInt(String s) {
        char[] array = s.toCharArray();
        int[] nums = new int[array.length];
        int result = 0;
        int temp = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            switch (array[i]) {
                case 'I' -> nums[i] = 1;
                case 'V' -> nums[i] = 5;
                case 'X' -> nums[i] = 10;
                case 'L' -> nums[i] = 50;
                case 'C' -> nums[i] = 100;
                case 'D' -> nums[i] = 500;
                case 'M' -> nums[i] = 1000;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == 0) {
                result += nums[i];
                break;
            }
            temp = nums[i - 1];
            if (temp >= nums[i])
                result += nums[i];
            else {
                result += nums[i] - temp;
                i --;
            }
        }
        return result;
    }
}