/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);  
        int n = nums.length, count=0, max=0, prevMax=Integer.MIN_VALUE;

        for(int pointer = 0; pointer < n; pointer++){
            if (nums[pointer] - 1 == prevMax) {
                count++;
                prevMax=nums[pointer];
            } else if (nums[pointer != prevMax]){
                count=1;
            }

            max = Math.max(count, max);
        }

        return max;
    }
}
// @lc code=end

