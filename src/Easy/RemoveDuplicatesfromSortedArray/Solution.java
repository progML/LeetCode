package Easy.RemoveDuplicatesfromSortedArray;

import java.util.Stack;

class Solution {
    public int removeDuplicates(int[] nums) {
        Stack<Integer> heap = new Stack<>();
        int[] dummy = new int[nums.length];
        int k = 1;
        heap.push(nums[0]);
        dummy[0] = nums[0];
        if (nums.length < 2) {
            nums[0] = heap.get(0);
            return k;
        } else {
            for (int i = 1; i < dummy.length; i++) {
                if (heap.peek() != nums[i]) {
                    heap.push(nums[i]);
                    k++;
                }
            }
        }
        for (int i = 1; i < dummy.length; i++) {
            if (heap.size() > i)
                nums[i] = heap.get(i);
            else
                nums[i] = ' ';
        }
        return k;
    }

}
