/*
 * @lc app=leetcode id=2149 lang=java
 *
 * [2149] Rearrange Array Elements by Sign
 */

// @lc code=start
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length, pos=0, neg=1;
        int[] ans = new int[n];

        for(int num : nums){
            if(num > 0){
                ans[pos] = num; 
                pos +=2;
            } else {
                ans[neg] = num; 
                neg +=2;
            }
        }
        return ans;
    }

    private void swapVal(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
// @lc code=end

