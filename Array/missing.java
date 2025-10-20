class missing {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int ideal_sum=(n*(n+1))/2;
        int real_sum=0;
        for(int i=0;i<n;i++){
            real_sum+=nums[i];
        }
        return ideal_sum-real_sum;
    }
}
