/*
 * @lc app=leetcode id=62 lang=java
 *
 * [62] Unique Paths
 */

// @lc code=start
class Solution {
    public int uniquePaths(int m, int n) {
        int ways[][] = new int[m][n];
        
        for (int i = 0; i < ways.length; i++) ways[i][0] = 1;
        for (int i = 0; i < ways[0].length; i++) ways[0][i] = 1;
        for (int i = 1; i < ways.length; i++) for (int j = 1; j < ways[0].length; j++) ways[i][j] += ways[i-1][j] + ways[i][j-1];

        return ways[m-1][n-1];
    }
}
// @lc code=end

