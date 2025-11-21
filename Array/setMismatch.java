class setMismatch{
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                k = nums[i];
            sum += nums[i];
        }
        sum += nums[nums.length - 1];
        int a = ((nums.length * (nums.length + 1)) / 2) - sum + k;
        int arr[] = new int[2];
        arr[0] = k;
        arr[1] = a;
        return arr;
    }
}