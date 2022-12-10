/*
 * @lc app=leetcode id=1339 lang=java
 *
 * [1339] Maximum Product of Splitted Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static long sum;
    static long maxProd;
    public static void dfs(TreeNode root) {
        if(root == null) return;
        sum += (long)root.val;
        dfs(root.left);
        dfs(root.right);
    }
    public static long checkMax(TreeNode root) {
        if(root == null) return 0;
        long l = checkMax(root.left);
        long r = checkMax(root.right);
        maxProd = Math.max(maxProd, (l + r + root.val) * (sum - l - r - root.val));
        return l + r + root.val;
    }
    public int maxProduct(TreeNode root) {
        sum = 0;
        maxProd = 0;
        dfs(root);
        long rootProd = checkMax(root);
        return (int)(maxProd % ((int)Math.pow(10, 9) + 7));
    }
}
// @lc code=end

