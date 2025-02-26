/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        // row traversal [0][..]
        // col traversal [..][0]

        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                // Transpose matrix elements
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                // reverse the matrix vertically[reverse the column sequence];
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][ n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    private void swapNum(int[][] arr, int left, int right){
      int temp = arr[left][right];
      arr[left][right] = arr[right][left];
      arr[right][left] = temp;
    }

}
// @lc code=end

