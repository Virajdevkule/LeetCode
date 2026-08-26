class Solution {
    public int maxProfit(int[] prices) {
        int bestBuy = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Find the lowest buying price
            bestBuy = Math.min(bestBuy, prices[i]);

            // Calculate today's profit
            int profit = prices[i] - bestBuy;

            // Update maximum profit
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}