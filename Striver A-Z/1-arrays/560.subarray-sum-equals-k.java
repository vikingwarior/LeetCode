/*
 * @lc app=leetcode id=560 lang=java
 *
 * [560] Subarray Sum Equals K
 */

// @lc code=start
class Solution {
    public int subarraySum(int arr[], int k) {
        int n = arr.length;
        int count = 0, sum = 0;
        Map<Integer, Integer> prefix = new HashMap<>();

        prefix.put(0,1);
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(prefix.containsKey(sum - k)){
                count += prefix.get(sum - k);
            }

            if(prefix.containsKey(sum)){
                prefix.put(sum, prefix.get(sum) + 1);
            } else {
                prefix.put(sum, 1);
            }

        }

    return count;
}
// @lc code=end

