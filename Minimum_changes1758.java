class Minimum_changes1758{
    // Generates alternating string starting with '1'
    // Example: if a = 5 → "10101"
    String frwd_form(int a){
        // StringBuilder is used because String is immutable
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < a; i++){
            // Even index → '1', Odd index → '0'
            if(i % 2 == 0) sb.append('1');
            else sb.append('0');
        }
        return sb.toString();
    }
    // Generates alternating string starting with '0'
    // Example: if a = 5 → "01010"
    String backward_form(int a){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < a; i++){
            // Even index → '0', Odd index → '1'
            if(i % 2 == 0) sb.append('0');
            else sb.append('1');
        }
        return sb.toString();
    }
    public int minOperations(String s) {
        int n = s.length();
        // Create both possible alternating patterns
        String s1 = frwd_form(n);     // "101010..."
        String s2 = backward_form(n); // "010101..."
        int c1 = 0, c2 = 0;  // Counters for mismatches
        // Compare original string with both patterns
        for(int i = 0; i < n; i++){
            if(s.charAt(i) != s1.charAt(i)) c1++;  // Count mismatches with first pattern
            if(s.charAt(i) != s2.charAt(i)) c2++;  // Count mismatches with second pattern
        }
        // Return the minimum changes required
        return Math.min(c1, c2);
    }
}