class Leetcode34{
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        int n=nums.length;
        int high=n-1;
        int low=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>target) high=mid-1;
            else if(nums[mid]<target) low=mid+1;
            else{
                ans[0]=mid;
                high=mid-1;
            }
        }
        high=n-1;
        low=0;
         while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>target) high=mid-1;
            else if(nums[mid]<target) low=mid+1;
            else{
                ans[1]=mid;
                low=mid+1;
            }
        }
        return ans;
    }
}