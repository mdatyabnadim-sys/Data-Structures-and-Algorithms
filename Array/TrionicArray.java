class TrionicArray {
    public boolean isTrionic(int[] nums) {
        int idx = 0;          // idx will mark transition points between phases
        boolean ans = false;  // final result flag

        // First two elements must start with a strictly increasing sequence
        if (nums[1] <= nums[0]) return ans;

        // Phase 1: strictly increasing
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                continue; // still increasing
            } 
            else if (nums[i + 1] < nums[i]) {
                idx = i;  // end of first increasing phase
                break;
            }
            // equal elements are not allowed in a trionic array
            if (nums[i + 1] == nums[i]) return false;
        }

        // If no decreasing phase was found, array is not trionic
        if (idx == 0) return false;

        // Phase 2: strictly decreasing
        for (int i = idx; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i]) {
                continue; // still decreasing
            } 
            else if (nums[i + 1] > nums[i]) {
                ans = true; // start of final increasing phase
                idx = i;    // mark transition point
                break;
            }
            // equal elements are not allowed
            if (nums[i + 1] == nums[i]) return false;
        }

        // Phase 3: strictly increasing again
        for (int i = idx; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                continue; // valid final increasing sequence
            } 
            else {
                ans = false; // any violation makes it non-trionic
            }
        }

        return ans;
    }
}