class smallest_letter_greater_than_target_optimised{
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        char ans = letters[0];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (letters[mid] > target) {
                ans = letters[mid];  //possible answer
                high = mid - 1;  //trying to find smaller one
            } else
                low = mid + 1;
        }
        return ans;
    }
}