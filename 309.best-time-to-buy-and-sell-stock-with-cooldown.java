class Solution {
    public int maxProfit(int[] prices){
        int len=prices.length;
        if(len==0)return 0;
        int sell=0, buy=-prices[0], cooldown=0;
        for(int i=1;i<len;i++){
            int pre_sell=sell, prev_cooldown=cooldown;
            sell=Math.max(buy+prices[i], sell);// sell
            cooldown=Math.max(Math.max(pre_sell,buy),cooldown);// cool down
            buy=Math.max(prev_cooldown-prices[i], buy);// buy
        }
        return Math.max(Math.max(sell,buy),cooldown);
    }
}
