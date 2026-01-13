class ParitySort{
    public int[] sortArrayByParity(int[] nums) {
        int a=0;
        int i=0;
        int n=nums.length;
        if(nums[0]%2==0) a++;
        for(i=1;i<n;i++){
            if(nums[i]%2==0) {
                int temp=nums[i];
                nums[i]=nums[a];
                nums[a]=temp;
                a++;
            }
        }
        return nums;
    }
}