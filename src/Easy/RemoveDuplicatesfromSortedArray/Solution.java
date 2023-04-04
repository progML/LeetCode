package Easy.RemoveDuplicatesfromSortedArray;

import java.util.Stack;

class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        if (nums.length == 1) return index + 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                nums[++index] = nums[i];
            }
        }
        return index + 1;
    }
}
