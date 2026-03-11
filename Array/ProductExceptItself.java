class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int pre_product = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = pre_product;
            pre_product *= nums[i];
        }
        int post_product = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= post_product;
            post_product *= nums[i];
        }
        return ans;
    }
}