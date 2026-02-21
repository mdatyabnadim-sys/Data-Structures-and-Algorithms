class Kth_missing_positive{
    public int findKthPositive(int[] arr, int k) {
        
        int n = arr.length;
        int lo = 0;
        int hi = n - 1;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            
            // In an ideal case (no missing numbers),
            // the value at index mid should be mid + 1
            int correctNo = mid + 1;
            
            // Number of missing elements before arr[mid]
            int missings = arr[mid] - correctNo;
            
            // If we already have k or more missing numbers,
            // the kth missing lies on the left side
            if (missings >= k)
                hi = mid - 1;
            else
                // Otherwise, it lies on the right side
                lo = mid + 1;
        }
        
        // After loop ends:
        // hi is the last index where missing < k
        // Final answer is calculated using pattern observation
        return hi + 1 + k;
    }
}