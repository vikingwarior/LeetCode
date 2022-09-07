/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String subString, String mainString) {
        int i = 0, j = 0;
        int length = subString.length();
        while(j<length && i < mainString.length())
        {
            if(mainString.charAt(i++)==subString.charAt(j)){
                j++;
            }
        }
        if(j == length) return true;
        return false;
    }
}
// @lc code=end

