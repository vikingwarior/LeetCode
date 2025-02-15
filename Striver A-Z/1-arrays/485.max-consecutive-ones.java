/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;

        for(int pointer = 0; pointer < nums.length; pointer++){
            if(nums[pointer] == 1){
                count++;
            }else{
                max = Math.max(max, count);
                count = 0;
            }
        }
        
        return Math.max(max, count);
    }
}
// @lc code=end

