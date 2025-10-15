class duplicate {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0; // pointer for the position of the unique element
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;               // move forward
                nums[i] = nums[j]; // copy unique value
            }
        }
        return i + 1; // length of array with unique elements
    }
}
