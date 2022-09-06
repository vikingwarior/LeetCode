/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
      int sum=0, tempSum=0;

      for(int i:nums) sum +=i;
      
      for (int i = 0; i < nums.length; i++) {
        if (sum - nums[i] - tempSum == tempSum) {
            return i;
        }
        tempSum += nums[i];
      }
        return -1;
    }
}
/*
 Alternate solution same runtime
 class Solution {
    public int pivotIndex(int[] nums) {
        int i=0, s=0, tempSum=0;
      for(int j:nums) s +=j;
      s-=nums[0];
      while (tempSum != s && i<nums.length-1) {
            tempSum += nums[i];
            i++;
            if(i<nums.length) s -= nums[i];
        }

        if(tempSum == s) return i;
        return -1;
    }
}

 */
// @lc code=end

