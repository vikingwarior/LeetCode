class Solution {

    public int myAtoi(String s) {

        int num=0;

        boolean negative = false;

        s=s.trim();

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            if(i==0 && !Character.isDigit(ch)) {

                if(ch=='-')

                    negative=true;

                else if(ch=='+')

                    continue;

                else

                    break;

            }

            else if(Character.isDigit(ch)) {

                if((Integer.MAX_VALUE-(ch-48))/10<num) return (negative? Integer.MIN_VALUE: Integer.MAX_VALUE);

                num=num*10+(ch-48);

            }

            else

                break;

        }

        return (negative)?num*-1:num;

    }

}
        

