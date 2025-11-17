class EvenNoCount{
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int digno=0;
            while(nums[i]!=0){
             nums[i]/=10;
             digno++;
            }
            if(digno%2==0) count++;
            else continue;
        }
        return count;
    }
}