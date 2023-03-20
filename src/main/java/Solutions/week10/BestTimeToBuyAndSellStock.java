package Solutions.week10;
/*
Question-1 Best Time to Buy and Sell Stock

You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:
Input: prices = [7,1,5,3,6,4] Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:
Input: prices = [7,6,4,3,1] Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
Constraints:
1 <= prices.length <= 105 0 <= prices[i] <= 104
 */

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] ints = null;

        ints = new int[]{7, 1, 5, 3, 6, 4}; // 5
        System.out.println(dummySolution(ints));
        //todo call your method from here with sout like above line

        ints = new int[]{7, 6, 4, 3, 1}; // 0
        System.out.println(dummySolution(ints));
        //todo call your method from here with sout like above line

        int[] price = {7, 1, 5, 3, 6, 4};
        int[] price2 = {7, 6, 4, 3, 1};

        System.out.println(maxProfit_Zehra(price)); // 5
        System.out.println(maxProfit_Zehra(price2)); // 0
    }

    static int dummySolution(int[] prices) {
        //just for method blueprint
        return 0;
    }

    public static int maxProfit_Zehra(int[] prices) {
        // min buy, max sell and buy must be first
        // simple logic: find min value for max profit, substract and compare
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {

            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}
