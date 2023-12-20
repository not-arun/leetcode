package easy._2706;

import java.util.Arrays;

class Solution {

    public int buyChoco(int[] prices, int money) {

        Arrays.sort(prices);
        int sum = prices[0] + prices[1];
        if (sum <= money) money = money - sum;
        return money;
    }
}
