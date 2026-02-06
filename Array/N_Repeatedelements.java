import java.util.*;
class N_Repeatedelements{
    public int repeatedNTimes(int[] nums) {
        int a=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) a=nums[i];
        }
        return a;
    }
}