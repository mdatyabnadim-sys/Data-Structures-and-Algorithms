class StringCompression443{
    public int compress(char[] chars) {
        int idx = 0; // write pointer for in-place modification
        int n = chars.length;
        for (int i = 0; i < n; i++) {
            char ch = chars[i]; 
            int count = 0; // counts occurrences of the current character
            // Count consecutive occurrences of the same character
            while (i < n && chars[i] == ch) {
                count++;
                i++;
            }
            // Always write the character first
            chars[idx++] = ch;
            // If frequency > 1, write its digits one by one
            if (count > 1) {
                String s = Integer.toString(count);
                // Convert count into individual characters
                // (needed for multi-digit counts like 12 → '1','2')
                for (char digit : s.toCharArray()) {
                    chars[idx++] = digit;
                }
            }
            // We moved one step ahead in the while loop,
            // so adjust i because the for-loop will increment it again
            i--;
        }
        return idx; // new length of compressed array
    }
}