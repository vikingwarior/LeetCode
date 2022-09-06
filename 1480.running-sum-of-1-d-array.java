/*
 * @lc app=leetcode id=1480 lang=java
 *
 * [1480] Running Sum of 1d Array
 */

// @lc code=start
class Solution {
    public int[] runningSum(int[] nums) {
        // int temp=nums[0];
        for(int i=1; i<nums.length; i++)
        {
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
// @lc code=end

