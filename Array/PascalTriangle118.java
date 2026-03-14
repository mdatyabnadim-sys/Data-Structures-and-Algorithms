import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        // This will store the final Pascal's Triangle
        List<List<Integer>> ans = new ArrayList<>();
        // Loop to create each row of the triangle
        for(int i = 0; i < numRows; i++){
            // Add a new empty row
            ans.add(new ArrayList<>());
            // Each row has (i + 1) elements
            for(int j = 0; j <= i; j++){
                // First and last element of every row is always 1
                // Because they have only one parent in Pascal's Triangle
                if(j == 0 || j == i)
                    ans.get(i).add(1);
                else
                    /*
                     Middle elements are the sum of two numbers
                     from the previous row:
                     ans[i][j] = ans[i-1][j] + ans[i-1][j-1]
                     Example:
                     Row above:   1  3  3  1
                     New row:    1 (4)(6)(4) 1
                    */
                    ans.get(i).add(
                        ans.get(i-1).get(j) + ans.get(i-1).get(j-1)
                    );
            }
        }
        // Return the completed Pascal's Triangle
        return ans;
    }
}