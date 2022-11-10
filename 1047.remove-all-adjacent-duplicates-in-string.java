/*
 * @lc app=leetcode id=1047 lang=java
 *
 * [1047] Remove All Adjacent Duplicates In String
 */

// @lc code=start
class Solution {
    public String removeDuplicates(String s) {
        int i = 0;
        while (true) {
            if (i >= s.length()-1 || s == "") {
                return s;
            }
            if (s.charAt(i) == s.charAt(i+1)) {
                s = s.substring(0, i) + s.substring(i+2, s.length());
                if(i == 0)i = -1;
                else i -= 2;
            }
            i++;
        }
    }
}
// @lc code=end

// "bbaacaab"