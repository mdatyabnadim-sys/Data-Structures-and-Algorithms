//Leetcode #3010. Divide an Array Into Subarrays With Minimum Cost I
class Division_of_array{
    public int minimumCost(int[] nums) {
        /*First element will always be added as it will be a part of disjoint contigous subarrays, and since we need minimum cost, therefore the other 2 elements will be the smallest and the second smallest element of the array, but other than the first element of the array*/
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= smallest) {
                second_smallest = smallest;
                smallest = nums[i];
            } else if (nums[i] < second_smallest && nums[i] != smallest)
                second_smallest = nums[i];
        }
        return nums[0] + smallest + second_smallest;
    }
}