class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int[] wf = new int[26];
        int[] wf2 = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            wf[word1.charAt(i) - 'a'] += 1;
            wf2[word2.charAt(i) - 'a'] += 1;
        }
        for( int i = 0; i < 26; i++ ){
           if( wf[i] == 0 && wf2[i] != 0 ) return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put(wf[i], map.getOrDefault(wf[i], 0) + 1);
            map.put(wf2[i], map.getOrDefault(wf2[i], 0) - 1);
        }
        for (var key: map.keySet()) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        return true;
    }
}
