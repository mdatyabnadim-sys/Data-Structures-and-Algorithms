class ReverseString541{
    public String reverseStr(String s, int k) {
        // Convert string to StringBuilder because String is immutable
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();
        // Move in steps of 2k (process one block at a time)
        for (int start = 0; start < n; start += 2 * k) {
            // i starts at beginning of current block
            int i = start;
            // j should end at start + k - 1
            // but we must not cross string length
            int j = Math.min(start + k - 1, n - 1);
            // Reverse characters between i and j
            while (i < j) {
                char temp1 = sb.charAt(i);
                char temp2=sb.charAt(j);
                sb.setCharAt(i, temp2);
                sb.setCharAt(j, temp1);
                i++;
                j--;
            }
        }
        // Convert back to String and return
        return sb.toString();
    }
}