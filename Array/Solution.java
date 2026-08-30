public class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxidx = 0;
        int minidx = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxidx = i;
            }
            if (nums[i] < min) {
                min = nums[i];
                minidx = i;
            }
        }
        int ans1 = 0;
        int ans2 = 0;
        if (maxidx >= minidx)
            ans1 = maxidx + 1;
        else
            ans1 = minidx + 1;
        ans2 = n - Math.min(minidx, maxidx);
        int ans3 = Math.min(minidx, maxidx) + 1 + n - Math.max(minidx, maxidx);
        return Math.min(ans1, Math.min(ans2, ans3));
    }
} {
    
}
