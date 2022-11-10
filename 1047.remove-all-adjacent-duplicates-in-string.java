import java.util.Stack;

/*
 * @lc app=leetcode id=1047 lang=java
 *
 * [1047] Remove All Adjacent Duplicates In String
 */

// @lc code=start
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> finalStringStack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (finalStringStack.isEmpty() || c != finalStringStack.peek()) {
                finalStringStack.push(c);
                continue;
            }
            finalStringStack.pop();
        }
        s = "";
        while (!finalStringStack.isEmpty()) {
            s += finalStringStack.pop();
        }
        return new StringBuilder(s).reverse().toString();
    }
}
// @lc code=end

// "bbaacaab"