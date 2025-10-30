class Singleno{
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);//sorts the array nums, so that all the duplicate elements come together
        for(int i=0;i<nums.length-1;i+=2){
        if(nums[i]!=nums[i+1]) 
        return nums[i];
        }
        return nums[nums.length-1];// If not found till now, the last one is unique
    }
}