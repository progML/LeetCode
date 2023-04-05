package Easy.SearchInsertPosition;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int firstIndex = 0;
        int midIndex = 0;
        int lastIndex = nums.length - 1;
        while (lastIndex >= firstIndex) {
            midIndex = (firstIndex + lastIndex) / 2;
            if (nums[midIndex] == target)
                return midIndex;
            if (nums[midIndex] > target)
                lastIndex = midIndex - 1;
            else
                firstIndex = midIndex + 1;
        }
        return firstIndex;
    }
}