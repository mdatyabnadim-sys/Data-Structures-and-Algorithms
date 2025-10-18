class majorityy{
    public int majorityElement(int[] nums) {
        int count=0;
        int majority=0;
        for(int i=0; i<nums.length; i++){
            if(count==0) majority = nums[i];
            count+=(majority==nums[i])?1:-1;
        }
    return majority;
    }
}
