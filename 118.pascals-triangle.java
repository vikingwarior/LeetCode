/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            List<Integer> subAns = generateRow(i);
            ans.add(subAns);
        }
        return ans;
    }

    private List<Integer> generateRow(int rowSize){
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int i = 1; i < rowSize; i++){
            int num = (row.get(i-1)) * (rowSize-i);
            num = num/i;
            row.add(num);
        }
        return row;
    }
}
// @lc code=end

