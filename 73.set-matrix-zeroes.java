/*
 * @lc app=leetcode id=73 lang=java
 *
 * [73] Set Matrix Zeroes
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {
        // To access the first rows(vertical)(up to down) -> matrix[..][0]
        // To access the first columns(horizontal)(left to right) -> matrix[0][..]

        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        int col0 = -1;

        for (int rowIndex = 0; rowIndex < rowSize; rowIndex++) {
            for (int colIndex = 0; colIndex < colSize; colIndex++) {
                if (matrix[rowIndex][colIndex] == 0) {
                    if (colIndex == 0) {
                        col0 = 0;
                    } else {
                        matrix[0][colIndex] = 0;
                    }

                    matrix[rowIndex][0] = 0;
                }
            }
        }

        for (int rowIndex = rowSize - 1; rowIndex >= 0; rowIndex--) {
            for (int colIndex = colSize - 1; colIndex > 0; colIndex--) {
                if (matrix[0][colIndex] == 0 || matrix[rowIndex][0] == 0) {
                    matrix[rowIndex][colIndex] = 0;
                }
            }
        }

        if (col0 == 0) {
            for (int i = 0; i < rowSize; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
// @lc code=end
