/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] arr) {
      int low = 0, mid = 0, n = arr.length, high = n-1;

      while(mid <= high){
          if(arr[mid] == 0){
              swapNum(arr, low, mid);
              low++;
              mid++;
          } else if(arr[mid] == 1){
              mid++;
          } else {
              swapNum(arr, mid, high);
              high--;
          }
      }
  }

  private static void swapNum(int[] arr, int left, int right){
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
  }
}
// @lc code=end

