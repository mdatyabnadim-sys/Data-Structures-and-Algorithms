public class minoperationsDivisibleBy3{
     public int minimumOperations(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]%3==0) continue;
            else count++;
        }
        return count;
    }
}
