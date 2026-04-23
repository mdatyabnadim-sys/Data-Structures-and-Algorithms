package Sorting;
import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
     ArrayList<Integer> ans= new ArrayList<>();
        int n=nums.length;
        int i=0;
        while(i<n){
            int idx=nums[i]-1;
            if(nums[i]==i+1 || nums[idx]==nums[i]) i++;
            else{
                int temp=nums[i];
                nums[i]=nums[idx];
                nums[idx]=temp;
            }
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i+1) ans.add(i+1);
        }
        return ans;
    }
}