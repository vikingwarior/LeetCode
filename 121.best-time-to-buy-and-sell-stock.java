// class Solution {
//     public int maxProfit(int[] prices) {
//         int minVal = prices[0], maxProfit = 0;
        
//        for(int i = 1; i < prices.length; i++){
//            if(prices[i] < minVal) minVal = prices[i];
           
//            if(prices[i] - minVal > maxProfit) maxProfit = prices[i] - minVal;
//        }
        
//         return maxProfit;
//     }
// }