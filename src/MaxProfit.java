import java.util.Arrays;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0;i < prices.length;i++) {
            if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
