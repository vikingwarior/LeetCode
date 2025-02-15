/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i=0, j=1;
        while(j < n && i < n){
            while(i < n && nums[i] != 0 ){
                i++;
            }

            while( j < i || j < n && nums[j] == 0){
                j++;
            }

            if(j < n && i < n){
                nums[i++] = nums[j];
                nums[j++] = 0;
            }
        }
    }
}
// @lc code=end

