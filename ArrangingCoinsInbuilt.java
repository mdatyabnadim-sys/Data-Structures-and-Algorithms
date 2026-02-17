class CoinsInbuilt{
    public int arrangeCoins(int n) {
         return (int)(Math.sqrt(8.0 * n + 1) - 1) / 2;
    }
}