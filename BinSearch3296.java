package Searching;
class Solution {
    
    // Finds the maximum value in the workerTimes array
    // Used to estimate the upper bound for binary search
    long max(int[] arr) {
        long ans = -1;
        for (int x : arr) {
            if (x > ans)
                ans = x;
        }
        return ans;
    }

    // Checks if it is possible to reduce mountainHeight within 'mid' seconds
    boolean check(long mid, int[] workerTimes, int mH) {

        long h = 0; // total height workers can reduce within 'mid' seconds

        for (int t : workerTimes) {

            /*
             Each worker takes:
             t * (1 + 2 + 3 + ... + k) seconds to remove k height.

             Sum of series:
             1 + 2 + ... + k = k(k+1)/2

             So time = t * k(k+1)/2

             We solve:
             t * k(k+1)/2 <= mid

             Rearranging and solving quadratic gives:
             k = (sqrt(1 + 8*mid/t) - 1) / 2
            */

            long k = (long)((Math.sqrt(1 + (8.0 * mid) / t) - 1) / 2);

            // Because of floating point precision, k might be slightly incorrect.
            // Adjust it safely.

            // If calculated k is too large
            while ((long)t * k * (k + 1) / 2 > mid) k--;

            // If calculated k is slightly smaller than possible
            while ((long)t * (k + 1) * (k + 2) / 2 <= mid) k++;

            // Add this worker's contribution
            h += k;

            // If total reduced height reaches the required mountain height
            if (h >= mH) return true;
        }

        // If total work done is still insufficient
        return false;
    }

    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {

        // Binary search lower bound
        long lo = 1;

        /*
         Upper bound:
         Worst case only the slowest worker works alone
         removing entire mountain.

         Time = max(workerTime) * (1 + 2 + ... + mountainHeight)
              = max(workerTime) * mountainHeight*(mountainHeight+1)/2

         Casting to long early prevents integer overflow.
        */
        long hi = (long) max(workerTimes) * mountainHeight * (mountainHeight + 1) / 2;

        long result = 0;

        // Binary search for minimum time
        while (lo <= hi) {

            long mid = lo + (hi - lo) / 2;

            // If workers can finish within 'mid' seconds
            if (check(mid, workerTimes, mountainHeight)) {
                result = mid;     // possible answer
                hi = mid - 1;     // try smaller time
            } else {
                lo = mid + 1;     // need more time
            }
        }

        return result;
    }
}