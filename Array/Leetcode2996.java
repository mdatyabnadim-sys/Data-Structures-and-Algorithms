class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1)
                sum += nums[i];
            else
                break;
        }
        Arrays.sort(nums);
        int ans = sum;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ans)
                ans++;
            else if (nums[i] > ans)
                break;
        }
        return ans;
    }
}