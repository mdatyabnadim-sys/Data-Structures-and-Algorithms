import java.util.*;
class Longest_balanced_Subarray{
    public int longestBalanced(int[] nums) {
int n = nums.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            Set<Integer> evenSet = new HashSet<>();
            Set<Integer> oddSet = new HashSet<>();

            for (int j = i; j < n; j++) {
                int num = nums[j];
                if ((num & 1) == 0) {
                    evenSet.add(num);
                } else {
                    oddSet.add(num);
                }

                if (evenSet.size() == oddSet.size()) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
        }
    }