class Solution {
    public boolean isPalindrome(String s) {
        
        // Convert entire string to lowercase to ignore case differences
        s = s.toLowerCase();
        
        // Remove all non-alphanumeric characters (keep only a-z and 0-9)
        s = s.replaceAll("[^a-z0-9]", "");
        
        int n = s.length();
        int i = 0;          // pointer from start
        int j = n - 1;      // pointer from end
        
        // Compare characters from both ends moving toward the center
        while (i < j) {
            
            // If mismatch found, it's not a palindrome
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            
            // Move both pointers inward
            i++;
            j--;
        }
        
        // If all characters matched
        return true;
    }
}