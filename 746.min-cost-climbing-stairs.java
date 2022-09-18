/*
 * @lc app=leetcode id=746 lang=java
 *
 * [746] Min Cost Climbing Stairs
 */

// @lc code=start
class Solution {
  public int minCostClimbingStairs(int[] cost) {
    int i = cost.length - 3;

    while (i >= 0) {
      cost[i] += Math.min(cost[i+1], cost[i+2]);
      i--;
    }

    return Math.min(cost[0], cost[1]);
  }
}
// @lc code=end

