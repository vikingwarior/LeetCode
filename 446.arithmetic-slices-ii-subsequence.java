/*
 * @lc app=leetcode id=446 lang=java
 *
 * [446] Arithmetic Slices II - Subsequence
 */

// @lc code=start
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
      int result = 0;
      Map<Integer, Integer>[] dp = new HashMap[nums.length];
      
      //Initializing the elements of the Map Array
      for(int i = 0; i < nums.length; i++)
        dp[i] = new HashMap<>();
      
      for(int i = 1; i < nums.length; i++){
        for(int j = 0; j < i; j++){
          int difference = nums[i] - nums[j]; //Computing the difference
          if((double)nums[i] - (double)nums[j] < Integer.MIN_VALUE || (double)nums[i] - (double)nums[j] > Integer.MAX_VALUE) continue;
          
          int count = dp[j].getOrDefault(difference, 0);//Get the occurances of differences previously, put 0 if none exists
          result += count; // add the occurances to final result
          dp[i].put(difference, dp[i].getOrDefault(difference, 0) + count + 1); // Add the total no of occurances for the given difference to the Map index corrosponding to given number
        }
      }
      return result;
    }
}
// @lc code=end

