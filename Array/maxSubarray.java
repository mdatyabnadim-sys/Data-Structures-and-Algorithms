class maxSubarray{
    public int maxSubArray(int[] nums) {
         int n=nums.length;
        int CurrentSum=nums[0],maxsum=nums[0];
        for(int i=1;i<n;i++){
        CurrentSum=Math.max(nums[i],CurrentSum+nums[i]);
        maxsum=Math.max(CurrentSum,maxsum);
        }
        return maxsum;
    }
}