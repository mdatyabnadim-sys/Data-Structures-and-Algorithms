class MergeSortedArrayOptimized{
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // Temporary array to store merged result
        int arr[] = new int[m + n];

        // i -> pointer for nums1 (valid elements only, up to m)
        // j -> pointer for nums2 (up to n)
        // k -> pointer for arr (merged array)
        int i = 0, j = 0, k = 0;

        // Merge both arrays while elements remain in both
        while (i < m && j < n) {

            /*
             * arr[k++] = nums1[i++]
             *
             * Step-by-step:
             * 1. arr[k] gets nums1[i]
             * 2. k is incremented AFTER assignment
             * 3. i is incremented AFTER accessing nums1[i]
             *
             * This keeps the code compact while correctly moving
             * both the destination pointer (k) and source pointer (i)
             */
            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];
            } 
            /*
             * Same logic here:
             * - nums2[j] is copied to arr[k]
             * - then j++ moves to next element in nums2
             * - k++ moves to next position in arr
             */
            else {
                arr[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from nums1, if any
        // i++ and k++ happen after assignment
        while (i < m) {
            arr[k++] = nums1[i++];
        }

        // Copy remaining elements from nums2, if any
        while (j < n) {
            arr[k++] = nums2[j++];
        }

        // Copy merged result back into nums1 (as required by problem)
        for (int x = 0; x < m + n; x++) {
            nums1[x] = arr[x];
        }
    }
}
