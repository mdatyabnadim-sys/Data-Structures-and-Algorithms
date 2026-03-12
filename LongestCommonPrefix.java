class Solution {
    public String longestCommonPrefix(String[] strs) {
        // If the array has no strings, there cannot be any common prefix
        if (strs.length == 0)
            return "";
        // Take the first string as the reference string
        // The common prefix cannot be longer than this string
        String first = strs[0];
        // Traverse each character of the first string
        for (int i = 0; i < first.length(); i++) {
            // Current character of the first string
            char ch = first.charAt(i);
            // Compare this character with the same position in every string
            for (int j = 0; j < strs.length; j++) {
                // Two conditions where prefix must stop:
                // 1. Current index exceeds length of another string
                // 2. Character at this position does not match
                if (i == strs[j].length() || strs[j].charAt(i) != ch)
                    // Return prefix up to previous index
                    return first.substring(0, i);
            }
        }
        // If loop completes, entire first string is the common prefix
        return first;
    }
}