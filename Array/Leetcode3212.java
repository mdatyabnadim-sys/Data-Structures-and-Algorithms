class Solution {
    public int numberOfSubmatrices(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        // Prefix sum matrices:
        // CumSumX[i][j] → number of 'X' from (0,0) to (i,j)
        // CumSumY[i][j] → number of 'Y' from (0,0) to (i,j)
        int[][] CumSumX = new int[m][n];
        int[][] CumSumY = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                // Step 1: Add current cell contribution
                if(grid[i][j] == 'X') CumSumX[i][j]++;
                if(grid[i][j] == 'Y') CumSumY[i][j]++;

                /*
                 Step 2: Build 2D prefix sum

                 Add values from:
                 - top cell
                 - left cell
                 - subtract top-left (to remove double counting)
                */

                // Add from top
                if(i - 1 >= 0){
                    CumSumX[i][j] += CumSumX[i - 1][j];
                    CumSumY[i][j] += CumSumY[i - 1][j];
                }

                // Add from left
                if(j - 1 >= 0){
                    CumSumX[i][j] += CumSumX[i][j - 1];
                    CumSumY[i][j] += CumSumY[i][j - 1];
                }

                // Remove double counted area (top-left)
                if(i - 1 >= 0 && j - 1 >= 0){
                    CumSumX[i][j] -= CumSumX[i - 1][j - 1];
                    CumSumY[i][j] -= CumSumY[i - 1][j - 1];
                }

                /*
                 Now:
                 CumSumX[i][j] = total 'X' in submatrix (0,0) → (i,j)
                 CumSumY[i][j] = total 'Y' in submatrix (0,0) → (i,j)

                 Condition:
                 Count submatrix if number of X == number of Y
                 and at least one character exists (avoid empty case)
                */
                if(CumSumX[i][j] == CumSumY[i][j] && CumSumX[i][j] > 0)
                    count++;
            }
        }

        return count;
    }
}