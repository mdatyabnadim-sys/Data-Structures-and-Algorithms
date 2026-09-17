class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        
        int n = arr.length;

        // i and j represent the left and right boundaries
        // of the current sliding window
        int i = 0;
        int j = 0;

        // Sum of elements inside the current window [i...j]
        int curr_sum = 0;

        // Length of the current subarray whose sum is target
        int len = 0;

        // Minimum total length of two non-overlapping
        // subarrays found so far
        int result = Integer.MAX_VALUE;

        // min_length_till_idx[j] stores the minimum length
        // of a valid subarray found from index 0 to j
        int[] min_length_till_idx = new int[n];

        // Minimum length of any valid subarray found so far
        int best_min = Integer.MAX_VALUE;

        // Initially, there is no valid subarray,
        // so every position contains Integer.MAX_VALUE
        Arrays.fill(min_length_till_idx, Integer.MAX_VALUE);

        // Expand the sliding window using j
        while (j < n) {

            // Add arr[j] to the current window
            curr_sum += arr[j];

            // If the sum becomes greater than target,
            // remove elements from the left until
            // the sum becomes <= target
            while (curr_sum > target) {
                curr_sum -= arr[i];
                i++;
            }

            // Current window has sum equal to target
            if (curr_sum == target) {

                // Length of the current valid subarray
                len = j - i + 1;

                // Check if there is a previous valid subarray
                // completely before the current subarray.
                // Using i - 1 ensures the two subarrays don't overlap.
                if (i > 0 && min_length_till_idx[i - 1] != Integer.MAX_VALUE)
                    result = Math.min(result, len + min_length_till_idx[i - 1]);

                // Keep the smallest valid subarray length found so far
                best_min = Math.min(best_min, len);
            }

            // Store the minimum valid subarray length
            // found from index 0 up to index j
            min_length_till_idx[j] = best_min;

            // Move the right pointer forward
            j++;
        }

        // If no two non-overlapping subarrays were found
        if (result == Integer.MAX_VALUE)
            return -1;

        return result;
    }
}