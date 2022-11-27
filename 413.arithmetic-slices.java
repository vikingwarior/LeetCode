/*
 * @lc app=leetcode id=413 lang=java
 *
 * [413] Arithmetic Slices
 */

// @lc code=start
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int dp = 0, result = 0;
        for(int i = 2;  i < nums.length; i++){
          if(nums[i]-nums[i-1] == nums[i-1]-nums[i-2]){
            dp++;
            result += dp;
          }
          else dp = 0;
        }
        return result;
    }
}
// @lc code=end

