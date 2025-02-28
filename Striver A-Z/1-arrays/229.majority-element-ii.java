/*
 * @lc app=leetcode id=229 lang=java
 *
 * [229] Majority Element II
 */

// @lc code=start
class Solution {
    public List<Integer> majorityElementmajorityElement(int []v) {
        int n = v.length;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        int count1 = 0, count2 = 0;

        List<Integer> ans = new ArrayList<>();

        for(int num : v){
            if(count1 == 0 && num != el2){
                count1=1;
                el1=num;
            } else if (count2 == 0 && num != el1){
                count2=1;
                el2=num;
            } else if (num == el1){
                count1++;
            } else if (num == el2){
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int num : v){
            if(num == el1) count1++;
            if(num == el2) count2++;
        }

        if(count1 > n/3) ans.add(el1);
        if(count2 > n/3) ans.add(el2);

        return ans;
    }
}
// @lc code=end

