class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] stack = new int[temperatures.length];
        int top = -1;
        int[] answers = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            while(top > -1 && temperatures[i] > temperatures[stack[top]]) {
                int j = stack[top--];
                answers[j] = i - j;
            }
            stack[++top] = i;
        }
        return answers;
    }
}

/*
Brute Force Solution
public int[] dailyTemperatures(int[] temperatures) {
        int[] answers = new int[temperatures.length];

        for(int i = 0; i < temperatures.length - 1; i++){
            for(int j = i+1; j < temperatures.length; j++){
                if(temperatures[j] > temperatures[i])
                {
                    answers[i] = j - i;
                    break;
                }
            }
        }
        return answers;
    }
*/
