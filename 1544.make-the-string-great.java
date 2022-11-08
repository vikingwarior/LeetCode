/*
 * @lc app=leetcode id=1544 lang=java
 *
 * [1544] Make The String Great
 */

// @lc code=start
class Solution {
    public String makeGood(String s) {
        int i = 0;
        while (true) {
            if (s == "" || i >= s.length()-1) break;
            if (s.charAt(i) != s.charAt(i+1)){
                if (s.charAt(i) == Character.toUpperCase(s.charAt(i+1)) || s.charAt(i) == Character.toLowerCase(s.charAt(i+1))) {
                    s = s.substring(0, i) + s.substring(i+2, s.length());
                    i = -1;
                }
            }
            i++;
        }
        return s;
    }
}
// @lc code=end

