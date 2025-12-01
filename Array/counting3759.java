import java.util.*;
class Solution {
    public int countElements(int[] nums, int k) {
    int n=nums.length;
        if(k==0) return n;
        Arrays.sort(nums);
        int g=nums[n-k];
        int count=0;
        for(int x: nums){
            if(x<g) count++;
        }
        return count;
    }
}