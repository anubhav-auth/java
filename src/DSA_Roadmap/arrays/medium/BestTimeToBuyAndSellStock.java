package DSA_Roadmap.arrays.medium;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
    int [] prices ={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int least_so_far = Integer.MAX_VALUE;
        int overall_profit = 0;
        int profit_if_sold_today = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < least_so_far){
                least_so_far = prices[i];
            }
            profit_if_sold_today = prices[i] - least_so_far;
            if(overall_profit < profit_if_sold_today){
                overall_profit = profit_if_sold_today;
            }
        }
        return overall_profit;
    }
}
