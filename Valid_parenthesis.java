package Recursion;
import java.util.*;
class Valid_parenthesis {
    // Recursive function to build valid parentheses
    public void generate(int n, int left, int right, String s, List<String> ans){

        // Base case:
        // When number of closing brackets reaches n,
        // the string is complete and valid
        if(right == n){
            ans.add(s);
            return;
        }

        // Add '(' if we still have left brackets remaining
        if(left < n)
            generate(n, left + 1, right, s + "(", ans);

        // Add ')' only if it won't make string invalid
        // i.e., closing brackets should never exceed opening
        if(right < left)
            generate(n, left, right + 1, s + ")", ans);
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        // Start recursion with 0 open and 0 close brackets
        generate(n, 0, 0, "", ans);

        return ans;
    }
}