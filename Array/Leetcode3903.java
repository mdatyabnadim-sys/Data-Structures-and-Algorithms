class Solution {
    int max(int[] nums,int i){
        int m=Integer.MIN_VALUE;
        for(int idx=0;idx<=i;idx++){
            if(nums[idx]>m) m=nums[idx];
        }
        return m;
    }
    int min(int[] nums,int i,int n){
        int a=Integer.MAX_VALUE;
        for(int idx=i;idx<=n-1;idx++){
            if(nums[idx]<a) a=nums[idx];
        }
        return a;
    }
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int is=0;
        for(int i=0;i<n;i++){
           is=max(nums,i)-min(nums,i,n);
           if(is<=k) return i;
        }
        return -1;
    }
}