class Search2D{
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int lo=0;
        int hi=m*n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int midRow=mid/n;
            int midCol=mid%n;
            if(matrix[midRow][midCol]==target) return true;
            else if(matrix[midRow][midCol]>target) hi=mid-1;
            else lo=mid+1;
        }
        return false;
    }
}