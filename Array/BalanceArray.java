import java.util.*;
class BalanceArray{
    public int minRemoval(int[] nums, int k) {
              int n = nums.length;

        // Sort to make min and max of any chosen set its endpoints
        Arrays.sort(nums);

        int left = 0;
        int maxWindow = 1;

        for (int right = 0; right < n; right++) {

            // Shrink window until it becomes valid
            while ((long) nums[right] > (long) k * nums[left]) {
                left++;
            }

            // Update largest valid window
            maxWindow = Math.max(maxWindow, right - left + 1);
        }

        // Elements to remove
        return n - maxWindow;
    }
}