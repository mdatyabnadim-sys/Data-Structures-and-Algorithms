class Solution {
    public int theMaximumAchievableX(int num, int t) {

        // We want to maximize x such that it can become equal to num
        // in at most t operations.

        // In one operation:
        // x can change by ±1
        // num can also change by ±1 (independently)

        // Best strategy to maximize x:
        // increase x by +1 and decrease num by -1 in each step

        // This increases the gap (x - num) by 2 per operation

        // In t operations, maximum gap we can create = 2 * t

        // So the maximum possible x = num + 2*t
        return num + 2 * t;
    }
}