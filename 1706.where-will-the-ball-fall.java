/*
 * @lc app=leetcode id=1706 lang=java
 *
 * [1706] Where Will the Ball Fall
 */

// @lc code=start
class Solution {
    public int[] findBall(int[][] grid) {
        int[] result = new int[grid[0].length];
        for (int i = 0; i < result.length; i++) {
            result[i] = findBallColumn(0, i, grid);
        }
        return result;
    }
    private int findBallColumn(int row, int column, int[][] grid){
        if(row == grid.length) return column;
        int nextColumn = row + grid[row][column];
        if (nextColumn < 0 ||
                nextColumn > grid[0].length-1 ||
                grid[row][column] != grid[row][nextColumn]) {
            return -1;
        }
        return findBallColumn(row+1, nextColumn, grid);
    }
}
// @lc code=end

/*
 * [[1,1,1,-1,-1],
 *  [1,1,1,-1,-1],
 *  [-1,-1,-1,1,1],
 *  [1,1,1,1,-1],
 *  [-1,-1,-1,-1,-1]]
 */