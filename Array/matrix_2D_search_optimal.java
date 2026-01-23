class matrix_2D_search_optimal{
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0; // pointer for row traversal (starting from first row)
        int j = matrix[0].length - 1; // pointer for column traversal (starting from last column)
        
        while (i < matrix.length && j >= 0) {
            // we are starting the traversal from the TOP-RIGHT corner
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] > target)
                j--; // move left when current element is greater than target
            else
                i++; // move down when current element is smaller than target
            
            /*
             We can use this two-pointer approach because:
             - Each row is sorted in ascending order from left to right
             - Each column is sorted in ascending order from top to bottom
            */
        }
        return false; // target not found in the matrix
    }
}