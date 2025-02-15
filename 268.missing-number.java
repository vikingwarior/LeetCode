/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int nSum = n*(n+1)/2;
        int arrSum=0;

        for (int i : nums) {
            arrSum += i;
        }

        return nSum-arrSum;
    }
}
// @lc code=end

