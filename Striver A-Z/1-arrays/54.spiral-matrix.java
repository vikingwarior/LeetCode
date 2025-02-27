/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int left = 0;
        int right = n-1;
        int bottom = m-1;

        while(top <= bottom && left <= right){
            //traversal left -> right
            for(int i = left; i <= right; i++){
                spiral.add(matrix[top][i]);
            }
            top++;

            //traversal top -> bottom
            for(int i = top; i <= bottom; i++){
                spiral.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){ // check if top is beneath the bottom
                //traversal right -> left
                for(int i = right; i >= left; i--){
                    spiral.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //traversal bottom -> top
            if(left <= right){ // check if left is past right
                for(int i = bottom; i >= top; i--){ 
                    spiral.add(matrix[i][left]);
                }
            
                left++;
            }            
        }

        return spiral;
    }
}
// @lc code=end

