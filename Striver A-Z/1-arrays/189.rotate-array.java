/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int d = k % n;

        reverseSubArr(nums, 0, n-d-1);
        reverseSubArr(nums, n-d, n-1);
        reverseSubArr(nums, 0, n-1);
    }

    private void reverseSubArr(int[] arr, int start, int end){
        while(end > start){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}
// @lc code=end

