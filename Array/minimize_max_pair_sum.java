import java.util.*;
class minimize_max_pair_sum{
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);// sorting the array
        int prevmax=Integer.MIN_VALUE;;
        int max=Integer.MIN_VALUE;
        /*we are pairing the smallest element with largest, second smallest with second largest and so on...
        because we need the maximum pair sum, but that sum should be less than the maximum sum formed by any other pairing*/
        for(int i=0;i<nums.length/2;i++){
           prevmax=nums[i]+nums[nums.length-i-1];
           max=Math.max(prevmax,max);
        }
        return max;
    }
}