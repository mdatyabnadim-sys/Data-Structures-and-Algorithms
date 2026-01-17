class pivot_index{
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            int rightsum=totalsum-leftsum-nums[i];
            if(leftsum==rightsum) return i;
            leftsum+=nums[i];
        }
        return -1;
    }
}