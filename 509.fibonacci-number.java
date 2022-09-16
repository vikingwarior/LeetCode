/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
    public int fib(int n) {
        if(n == 0) return 0;  
      
        else if(n == 1 || n == 2) return 1;
        return getFibo(1, 1, 3, n);
    }

    public int getFibo(int prev, int curr, int num, int target){
        if(num-1 == target) return curr;

        return getFibo(curr, curr+prev, ++num, target);
    }
}
// @lc code=end

