class max_prod{
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                second_max=max;
                max=nums[i];
            }
            else if(nums[i]>second_max) second_max=nums[i];
        }
        return (max-1)*(second_max-1);
    }
}