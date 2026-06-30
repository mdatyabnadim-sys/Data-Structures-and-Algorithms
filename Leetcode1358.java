class Leetcode1358{
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int result = 0;

        // Frequency array to track count of 'a', 'b', 'c'
        int[] mp = new int[3];

        int i = 0; // left pointer (start of window)
        int j = 0; // right pointer (end of window)

        while (j < n) {
            char ch = s.charAt(j);

            // Include current character in window
            mp[ch - 'a']++;

            // Check if current window contains at least one 'a', 'b', and 'c'
            while (mp[0] > 0 && mp[1] > 0 && mp[2] > 0) {

                // If valid, then all substrings starting from i and ending from j to n-1 are valid
                // because extending the window further will still keep all 3 characters
                result += (n - j);

                // Shrink window from left to find smaller valid window
                mp[s.charAt(i) - 'a']--;
                i++;
            }

            // Expand window by moving right pointer
            j++;
        }

        return result;
    }
}