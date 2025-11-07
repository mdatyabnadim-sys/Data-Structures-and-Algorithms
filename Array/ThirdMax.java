class ThirdMax{
    public int thirdMax(int[] nums) {
        long max=Long.MIN_VALUE;
        long secondmax=Long.MIN_VALUE;
        long thirdmax=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                thirdmax=secondmax;
                secondmax=max;
                max=nums[i];
            }
            else if(nums[i]>secondmax&& max!=nums[i]){
                thirdmax=secondmax;
                secondmax=nums[i];
            }
            else if(nums[i]>thirdmax && secondmax!=nums[i] && max!=nums[i]){
                thirdmax=nums[i];
            } 
        }
        if(thirdmax==Long.MIN_VALUE) return (int)max;
        else return (int)thirdmax;
    }
}