class Solution {
    public int lengthOfLongestSubstring(String s) {

        int h=0,t=0,max=0;
        Set<Character> st = new HashSet<>();
        while (h < s.length()) {
            while(st.contains(s.charAt(h))) 
            {
                st.remove(s.charAt(t));
                t++;
            }
            st.add(s.charAt(h));
            max = Math.max(max, h-t+1);
            h++;
            
        }
        return max;
    }
}