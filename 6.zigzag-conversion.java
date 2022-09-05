class Solution {

    public String convert(String s, int numRows) {
        if(s.length() <= numRows || numRows==1){
          return s;
        }
      
        int i=0, j=0, index=0;
        char[] zigZag = new char[s.length()];

        while (i<numRows) {
            index=i;
            while (index<s.length()) {
                zigZag[j++] = s.charAt(index);
                
                if (numRows-1 != i) {
                    index += (numRows-1-i)*2;
                
                }else{
                    index += (numRows-1)*2;
                }

                if (index<s.length() && i>0){
                    zigZag[j++] = s.charAt(index);
                    index += i*2;
                }
            }
            i++;
        }

        return new String(zigZag);
    }
}