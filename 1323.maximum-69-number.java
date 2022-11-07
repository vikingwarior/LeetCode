/*
 * @lc app=leetcode id=1323 lang=java
 *
 * [1323] Maximum 69 Number
 */

// @lc code=start
class Solution {
    public int maximum69Number (int num) {
        char[] nums = Integer.toString(num).toCharArray();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == '6') {
                nums[i] = '9';
                break;
            }
        }

        return Integer.parseInt(new String(nums));
    }

    /*
     * Optimal Solution:
     * public int maximum69Number (int num) {
        return Integer.parseInt(("" + num).replaceFirst("6", "9"));
       }
     */
}
// @lc code=end

