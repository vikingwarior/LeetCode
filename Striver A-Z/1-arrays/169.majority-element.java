/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public static int majorityElement(int []v) {

        // Optimal -> using moores voting algorithm
        int n = v.length;
        int count = 0;
        int element=-1;

        for(int num : v){
            if(num != element){
                if(count == 0) element = num;
                else count--;
            } else {
                count++;
            }
        }

        return element;

        // Brute

        // int pointer = 0;
        // int val = v[0];

        // Arrays.sort(v);

        // while(pointer < n){
        //     while(pointer < n && v[pointer] == val){
        //         count++;
        //         pointer++;
        //     }

        //     if(count > (n/2)+1){
        //         return val;
        //     }

        //     count = 1;
        //     if(pointer < n) val = v[pointer]; 
        // }

        // return 1;
    }
}
// @lc code=end

