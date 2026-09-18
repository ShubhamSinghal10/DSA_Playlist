class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        
        int buying = prices[0];

        for(int i = 0; i < prices.length; i++) {

            int selling = prices[i];

            if(selling > buying) {
                maxProfit = Math.max(maxProfit, selling-buying);
            }

            else buying = selling;
        }
        return maxProfit;
    }
}