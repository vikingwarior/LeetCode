/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int index = 0; index < nums.length - 1; index += 2){
            if(nums[index] != nums[index+1]){
                return nums[index];
            }
        }
        return nums[nums.length-1];
    }
}
// @lc code=end

