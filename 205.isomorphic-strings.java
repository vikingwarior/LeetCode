import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

// @lc code=start
public class Solution {
    
    public boolean isIsomorphic(String str1, String str2) {

        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        int length = s1.length;
        if(length != s2.length) return false;

        char[] auxS1 = new char[256];
        char[] auxS2 = new char[256];

        for(int i=0; i<length; i++){
            char s1Character = s1[i];
            char s2Character = s2[i];
            if(auxS1[s1Character] == 0 && auxS2[s2Character] == 0){
                auxS1[s1Character] = s2Character;
                auxS2[s2Character] = s1Character;
            }
            else{
                if(auxS1[s1Character] != s2Character || auxS2[s2Character] != s1Character) return false;
            }
        }
        return true;
    }
}
// @lc code=end
