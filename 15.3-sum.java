/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int first = Integer.MIN_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i <= n-3; i++){
            if(nums[i] == first) continue;

            first = nums[i];
            int j = i+1;
            int k = n-1;

            while(j < k){
                int second = nums[j];
                int third = nums[k];
                int sum = first + second + third;

                /* 
                    The if else-if and else block is a modified binary search:
                    If the sum is greater than 0 that means we need to take elements smaller elements so we shrink the array towards left i.e. reduce k
                    and vice-versa when sum is lesser than 0.
                */
                if(sum == 0){
                    ans.add(List.of(first, second, third));

                    // Increment j until a new value is found
                    while(j < k && nums[j] == second){
                        j++;
                    }

                    // Decrease k until new value found
                    while ( j < k && nums[k] == third){
                        k--;
                    }

                } else if(sum < 0) {
                    while(j < k && nums[j] == second){
                        j++;
                    }
                } else {
                    while ( j < k && nums[k] == third){
                        k--;
                    }
                }
            }
        }

        return ans;
    }
}
// @lc code=end

