/*
 * @lc app=leetcode id=1207 lang=java
 *
 * [1207] Unique Number of Occurrences
 */

// @lc code=start
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int a : arr)
            count.put(a, 1 + count.getOrDefault(a, 0));
        return count.size() == new HashSet<>(count.values()).size();
    }
}
// @lc code=end

