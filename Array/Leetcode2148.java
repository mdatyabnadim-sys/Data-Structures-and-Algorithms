class Leetcode2148{
    public int countElements(int[] nums) {
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
            if (nums[i] < min)
                min = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > min && nums[i] < max)
                count++;
        }
        return count;
    }
}