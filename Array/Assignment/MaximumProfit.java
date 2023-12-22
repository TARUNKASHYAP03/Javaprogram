package JavaProgram.Array.Assignment;

public class MaximumProfit {
    public static int profit(int price[]) {
        int buyprice = Integer.MAX_VALUE;

        int maxprofit = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyprice < price[i]) {
                int profit = price[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = price[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int price[] = { 7, 6, 4, 3, 1 };
        System.out.println("Maximum profit: " + profit(price));

        int price1[] = { 7, 1, 5, 3, 6, 4 }; // Corrected array name to "price1"
        System.out.println("Maximum profit: " + profit(price1));

        int price2[] = { 3, 6, 6, 3, 1 };
        System.out.println("Maximum profit: " + profit(price2));
    }
}
