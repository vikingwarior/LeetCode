/*
 * @lc app=leetcode id=901 lang=java
 *
 * [901] Online Stock Span
 */

// @lc code=start
class StockSpanner {

    public StockSpanner() {
        
    }
    
    Stack<int[]> priceTracker = new Stack<>();
    public int next(int price) {
        int span = 1;
        while (!priceTracker.isEmpty() && priceTracker.peek()[0] <= price)
            span += priceTracker.pop()[1];
        priceTracker.push(new int[]{price, span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
// @lc code=end

