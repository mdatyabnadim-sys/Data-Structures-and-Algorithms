import java.util.*;
class equal_and_divisible_pairs{
    public int countPairs(int[] nums, int k) {
        int first=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && i*j%k==0 ) count++;
            }
        }
        return count;
    }
}