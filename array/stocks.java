public class stocks {

    public static int buySell(int[] arr) {
        int maxProfit = 0;
        int[] buyPrice = new int[arr.length];

        buyPrice[0] = arr[0];

        // Track minimum buy price till each day
        for (int i = 1; i < arr.length; i++) {
            buyPrice[i] = Math.min(buyPrice[i - 1], arr[i]);
        }

        // Calculate max profit
        for (int i = 0; i < arr.length; i++) {
            int profit = arr[i] - buyPrice[i];
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stockPrices = {7, 1, 5, 3, 6, 4};
        int profit = buySell(stockPrices);
        System.out.println("Max Profit: " + profit);
    }
}
