class BuySellStock {
    private int buysellStock(int[] array) {
        int max_profit = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int profit = array[j] - array[i];
                if (profit > max_profit) {
                    max_profit = profit;
                }
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] array = { 7, 1, 5, 3, 6, 4 };
        BuySellStock buysellstock = new BuySellStock();
        int profit = buysellstock.buysellStock(array);
        System.out.println("Profit is : " + profit);
    }
}