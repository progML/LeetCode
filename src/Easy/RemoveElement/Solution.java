package Easy.RemoveElement;

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        if (nums.length == 0 || (nums.length == 1 && nums[0] == val)) return 0;
        for (int i = 0; nums.length > i; i++) {
            if (nums[i] == val) {
                count++;
                continue;
            }
            if (count != 0) {
                nums[i - count] = nums[i];
            }
        }
        return nums.length - count;
    }
}
