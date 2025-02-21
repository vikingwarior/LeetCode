/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakpoint = -1, localMin = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i + 1] > nums[i]) {
                breakpoint = i;
                break;
            }
        }

        if (breakpoint == -1) {
            revArr(nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > breakpoint; i--) {
            if (nums[i] > nums[breakpoint]) {
                swapVal(nums, breakpoint, i);
                localMin = i;
                break;
            }
        }

        revArr(nums, breakpoint + 1, n - 1);

    }

    private void revArr(int[] nums, int start, int end) {
        while (start < end) {
            swapVal(nums, start++, end--);
        }
    }

    private void swapVal(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
// @lc code=end

