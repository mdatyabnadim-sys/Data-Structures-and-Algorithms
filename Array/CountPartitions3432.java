class CountPartitions3432{ 
    public int countPartitions(int[] nums) {

        int n = nums.length;   // total number of elements in the array
        
        int sum = 0;          // variable to store total sum of array
        
        // Calculate total sum of all elements
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }

        // If total sum is odd, we can never split it
        // into two parts having equal (even) sum
        if(sum % 2 != 0) 
            return 0;

        // If total sum is even:
        // We can partition after any index from 0 to n-2
        // That gives (n - 1) possible partitions
        return n - 1;
    }
}