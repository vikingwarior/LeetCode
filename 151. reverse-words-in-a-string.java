class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\s+");
        int w = words.length;
        StringBuilder str = new StringBuilder();
        int i;
        for(i=w-1;i>0;i--){
            str.append(words[i]);
            str.append(" ");
        }
        str.append(words[0]);

        return str.toString();
    }
}