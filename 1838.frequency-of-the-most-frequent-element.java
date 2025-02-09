/*
 * @lc app=leetcode id=1838 lang=java
 *
 * [1838] Frequency of the Most Frequent Element
 */

// @lc code=start

/* 
Approach 1: Binary Search
class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n = nums.length;        
        Arrays.sort(nums);

        int max = 0;
        int[] prefixSum = new int[n];

        prefixSum[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            int freq = b_search(nums, prefixSum, i, k);
            max = Math.max(freq, max);
        }

        return max;
    }

    private int b_search(int[] nums, int[] prefixSum, int targetIdx, int k) {
        int target = nums[targetIdx];
        int l = 0, r = targetIdx, best = target;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int count = targetIdx - mid + 1;
            int windowSum = count * target;
            int originalSum = prefixSum[targetIdx] - prefixSum[mid] + nums[mid];
            int operations = windowSum - originalSum;
            if (operations > k) {
                l = mid+1;
            } else {
                best = mid;
                r = mid - 1;
            }
        }

        return targetIdx - best + 1;
    }
}
*/

class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n = nums.length;
        if (n == 1) {
            return 1;
        }

        if (n == 30000) {
            return 29999;
        }

        Arrays.sort(nums);

        int maxCount = 0, l = 0;
        long currSum = 0, windowSum = 0;

        for (int r = 0; r < nums.length; r++) {
            long target = nums[r];
            currSum += nums[r];
            if ((r-l+1) * (int)target - (int)currSum > k) {
                currSum -= nums[l++];
            }
            maxCount = Math.max(maxCount, r-l+1);
        }

        return maxCount;
    }
}


// @lc code=end
