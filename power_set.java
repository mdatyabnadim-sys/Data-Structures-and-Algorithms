package Recursion;
import java.util.*;
class Solution {

    public List<String> AllPossibleStrings(String s) {
        List<String> list = new ArrayList<>();

        // Start recursion with empty string
        subsets("", s, 0, list);

        // Sort result as required by GFG
        Collections.sort(list);

        return list;
    }

    // Recursive function to generate all subsets
    public void subsets(String ans, String s, int idx, List<String> list){

        // Base case:
        // When we've processed all characters
        if(idx == s.length()){

            // Avoid adding empty string
            if(ans.length() != 0)
                list.add(ans);

            return;
        }

        char ch = s.charAt(idx);

        // Pick the current character
        subsets(ans + ch, s, idx + 1, list);

        // Skip the current character
        subsets(ans, s, idx + 1, list);
    }
}