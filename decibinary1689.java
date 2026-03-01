package Strings;
class decibinary1689{
    public int minPartitions(String n) {
        // This will store the maximum digit found in the string
        int max = -1;
        // Traverse each character (digit) in the string
        for (int i = 0; i < n.length(); i++) {
            // Convert character to its numeric value
            int digit = n.charAt(i) - '0';
            // Keep track of the maximum digit
            if (digit > max) {
                max = digit;
            }
        }
        // Key Idea:
        // The minimum number of deci-binary numbers required
        // is equal to the maximum digit present in the number.
        //
        // Why?
        // Because in each deci-binary number, we can add only 0 or 1
        // at any digit position.
        //
        // So if a position has digit '7', we need at least 7 layers
        // (7 deci-binary numbers) to build that digit.
        //
        // Therefore, the answer is simply the maximum digit.
        return max;
    }
}