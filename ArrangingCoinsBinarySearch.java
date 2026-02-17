class ArrangingCoinsBinarySe{

    public int sqrt(long x) {
        if (x == 0)
            return 0;

        long lo = 1, hi = x;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;

            if (mid == x / mid)
                return (int) mid; // same as mid * mid == x

            else if (mid > x / mid)
                hi = mid - 1; // same as mid * mid > x

            else
                lo = mid + 1; // same as mid * mid < x
        }

        return (int) hi; // integer square root
    }

    public int arrangeCoins(int n) {

        /*
         We know:
         n = 1 + 2 + 3 + ... + k
         
         Sum of first k natural numbers:
         k(k + 1) / 2 <= n
         
         Rearranging:
         k^2 + k - 2n <= 0
         
         Solve quadratic equation:
         k = (-1 + sqrt(1 + 8n)) / 2
         
         We take only the positive root since k cannot be negative.
         Also, we need the integer value (floor), so we use integer sqrt.
        */

        long m = (long) n; // convert to long to avoid overflow

        return (sqrt(8 * m + 1) - 1) / 2;
    }
}