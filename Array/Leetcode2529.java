class Solution {
    public int maximumCount(int[] nums) {
        
        int n = nums.length;
        int negCount = 0;
        int posCount = 0;
        
        int lo = 0;
        int hi = n - 1;
        
        // Binary Search 1:
        // Find the index of the first element >= 0
        // That index will also represent the count of negative numbers
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            
            if (nums[mid] >= 0)
                hi = mid - 1;   // move left to find earlier non-negative
            else
                lo = mid + 1;   // still negative, move right
        }
        
        // 'lo' now points to the first non-negative number
        // So number of negatives = lo
        negCount = lo;
        
        // Reset search space
        lo = 0;
        hi = n - 1;
        
        // Binary Search 2:
        // Find the index of the first element > 0
        // That helps us count positive numbers
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            
            if (nums[mid] <= 0)
                lo = mid + 1;   // move right to skip zero/negatives
            else
                hi = mid - 1;   // found positive, try to find earlier one
        }
        
        // 'lo' now points to the first positive number
        // So number of positives = n - lo
        posCount = n - lo;
        
        // Return the maximum of positive and negative counts
        return Math.max(negCount, posCount);
    }
}