class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] <= 0 || nums[i] > n || nums[i] == i + 1 || nums[i] == nums[nums[i] - 1])
                i++;
            // nums[i]<=0 ensures negatives and zeroes are ignored
            // nums[i]>n is for those which are not in the range 1 to n
            // nums[i]==i+1 for those which are already in their correct position
            // nums[i]==nums[nums[i]-1] if the same element is present in the correct position of nums[i] 
            // or we can say there is repetetion, so to avoid infinite loop this condition is included.
            else {
                int idx=nums[i]-1;
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
            }
        }
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1)
                return i + 1;
        }
        return n + 1;
    }
}