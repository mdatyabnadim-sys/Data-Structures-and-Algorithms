import java.util.*;
class GoodPairs{
    public int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);// sorting the array
        int count = 1;
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])// we the previous number is same as current number
                count++;
            else {  // when the previous number is not same as the current number
                ans += count * (count - 1) / 2; //countC2 , here basically we are choosing the number of ways to select 2 numbers(or pairs)   out of count number of same numbers.
                count = 1;// resetting the value of count
            }
        }
        ans += count * (count - 1) / 2;// adding all the possible pairs
        return ans;
    }
}