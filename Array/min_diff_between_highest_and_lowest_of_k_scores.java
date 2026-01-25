import java.util.*;
class min_diff_between_highest_and_lowest_of_k_scores{
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);//sorting the array
        int n = nums.length;
        if (n == 0)
            return 0;
        int min_diff = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i + k - 1 < n; i++) {
            /*We are choosing the consecutive k values as the difference between the highest and the lowest value will be minimum only if we will do so, and we are checking all possible consecutive k pairs and storing the minimum value in min_diff*/
            diff = nums[i + k - 1] - nums[i];
            min_diff = Math.min(diff, min_diff);
        }
        return min_diff;
    }
}