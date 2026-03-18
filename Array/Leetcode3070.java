class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        // Traverse each cell of the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                /*
                 Convert grid into a 2D prefix sum matrix in-place.

                 grid[i][j] will store sum of submatrix:
                 from (0,0) to (i,j)

                 Formula:
                 sum(i,j) = current value
                          + top
                          + left
                          - top-left (to avoid double counting)
                */

                // Add value from top cell
                if (i - 1 >= 0)
                    grid[i][j] += grid[i - 1][j];

                // Add value from left cell
                if (j - 1 >= 0)
                    grid[i][j] += grid[i][j - 1];

                // Subtract top-left (overlapping region counted twice)
                if (i - 1 >= 0 && j - 1 >= 0)
                    grid[i][j] -= grid[i - 1][j - 1];

                /*
                 Now grid[i][j] represents sum of submatrix
                 from (0,0) to (i,j)

                 Check if this sum is <= k
                */
                if (grid[i][j] <= k)
                    count++;
                else
                    // Optimization:
                    // Since values are increasing row-wise,
                    // no need to check further columns in this row
                    break;
            }
        }

        return count;
    }
}