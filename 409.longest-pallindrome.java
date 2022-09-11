public class Solution {
    public int longestPalindrome(String s) {
        
        int[] charCount = new int[128];
        int maxSize = 0;
        
        for(char i: s.toCharArray()) charCount[i]++;
        
        for(int i: charCount){
            
            maxSize += i/2 * 2;
            if(i % 2 == 1 && maxSize%2 == 0){
                maxSize++;
            }
        }
        return maxSize;        
    }
}