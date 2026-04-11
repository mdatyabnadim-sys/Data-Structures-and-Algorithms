class CountAndSay{
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        String s = countAndSay(n - 1);
        int i = 0, j = 0;
        String ans = "";
        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j))
                j++;
            else {
                int freq = j - i;
                ans += freq;
                ans += s.charAt(i);
                i = j;
            }
        }
        int freq = j - i;
        ans += freq;
        ans += s.charAt(i);
        return ans;
    }
}