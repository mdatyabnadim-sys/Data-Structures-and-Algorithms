class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {

        // Define boundaries of the k x k submatrix
        int startrow = x;           // top row of submatrix
        int endrow = x + k - 1;     // bottom row of submatrix
        int startcol = y;           // left column
        int endcol = y + k - 1;     // right column

        /*
         Idea:
         Reverse the submatrix vertically (top ↔ bottom)

         We swap:
         - first row with last row
         - second row with second-last row
         and so on...
        */

        // Continue until the rows meet or cross
        while(startrow < endrow){

            // Traverse each column within the submatrix
            for(int j = startcol; j <= endcol; j++){

                // Swap elements of current column between top and bottom row
                int temp = grid[startrow][j];
                grid[startrow][j] = grid[endrow][j];
                grid[endrow][j] = temp;
            }

            // Move towards the center
            startrow++;
            endrow--;
        }

        // Return modified grid
        return grid;
    }
}