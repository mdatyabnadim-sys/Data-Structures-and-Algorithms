class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target) return mid;
            else if(nums[lo]<=nums[mid]){ // if left half is sorted
                 if(nums[lo]<=target && target<nums[mid]) hi=mid-1; // if the target lies in that sorted part
                 else lo=mid+1; // if the target lies in unsorted part
            }
            else{ // if right half is sorted
               if(nums[mid]<target && target<=nums[hi]) lo=mid+1; // if the target lies in sorted part
               else hi=mid-1; // if the target lies in unsorted part
            }
        }
        return -1;
    }
}