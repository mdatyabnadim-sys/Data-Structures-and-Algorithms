class smallerThanCurrentNumbers{
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int count=0;
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                if(nums[i]<nums[j]) count++;
            }
            arr[j]=count;
            count=0;
        }
        return arr;
    }
}