/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] arr) {

        int max = arr[0], sum = 0;

		for(int i : arr){
			if(sum < 0) sum = 0;
			sum += i;
			max = Math.max(max, sum);
		}

		return max;
    }
}
// @lc code=end

