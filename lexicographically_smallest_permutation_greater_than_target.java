import java.util.*;
import java.util.Arrays;
class lexicographically_smallest_permutation_greater_than_target{
    public String lexGreaterPermutation(String s, String target) {
    char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String quinorath = new String(chars); 
        boolean[] used = new boolean[s.length()];
        StringBuilder current = new StringBuilder();
        String[] result = new String[1];
        backtrack(chars, target, used, current, result);
        return result[0] == null ? "" : result[0];
    }
    private void backtrack(char[] quinorath, String target, boolean[] used,
                           StringBuilder current, String[] result) {
        if (result[0] != null) return; 
        int len = current.length();
        if (len == quinorath.length) {
            String candidate = current.toString();
            if (candidate.compareTo(target) > 0) {
                result[0] = candidate;
            }
            return;
        }
        for (int i = 0; i < quinorath.length; i++) {
            if (used[i]) continue;
            if (i > 0 && quinorath[i] == quinorath[i - 1] && !used[i - 1]) continue;
            if (len < target.length() && current.length() == len) {
                if (!isPromising(current, quinorath[i], target)) {
                    continue;
                }
            }
            used[i] = true;
            current.append(quinorath[i]);
            backtrack(quinorath, target, used, current, result);
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }
    private boolean isPromising(StringBuilder prefix, char nextChar, String target) {
        int pos = prefix.length();
        if (pos >= target.length()) return true;
        char targetChar = target.charAt(pos);
        return (prefix.toString() + nextChar).compareTo(target.substring(0, pos + 1)) > 0
                || (prefix.toString() + nextChar).compareTo(target.substring(0, pos + 1)) == 0;
    }
}