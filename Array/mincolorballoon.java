class mincolorballoon{
    public int minCost(String colors, int[] neededTime) {
         int time = 0;
        int n = colors.length();
        for (int i = 1; i < n; i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                //storing the minimum time b/w i'th and (i-1)'th balloon.
                time += Math.min(neededTime[i], neededTime[i - 1]);
                // Keep the higher time balloon for next comparison
                neededTime[i] = Math.max(neededTime[i], neededTime[i - 1]);
            }
        }
        return time;
    }
}