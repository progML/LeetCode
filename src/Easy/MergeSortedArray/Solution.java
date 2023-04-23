package Easy.MergeSortedArray;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n - 1;
        for (int i = length; n > 0; i--) {
            nums1[i] = nums2[--n];
        }
        Arrays.sort(nums1);
    }
}