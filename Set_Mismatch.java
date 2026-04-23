package Sorting;
import java.util.*;
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            int idx=nums[i]-1;
             if (nums[i] != nums[idx]) {
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
        } 
    else i++;
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i+1){
                return new int[]{nums[i],i+1};
            }
        }
        return new int[]{-1, -1};
    }
}