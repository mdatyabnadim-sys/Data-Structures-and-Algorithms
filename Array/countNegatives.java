class countNegatives{
    public int countNegatives(int[][] grid) {
        int i=0;
        int m=grid.length;
        int n=grid[i].length;
        int count=0;
        for(i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]<0) count++;
            }
        }
        return count;
    }
}