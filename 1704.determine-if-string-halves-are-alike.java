/*
 * @lc app=leetcode id=1704 lang=java
 *
 * [1704] Determine if String Halves Are Alike
 */

// @lc code=start
class Solution {
    public boolean halvesAreAlike(String s) {
    
        var set=Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int a=0;
        int b=0;
        
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            a+=set.contains(s.charAt(i))?1:0;
            b+=set.contains(s.charAt(j))?1:0;
        }
        
        return a==b;
    }
}
// @lc code=end

