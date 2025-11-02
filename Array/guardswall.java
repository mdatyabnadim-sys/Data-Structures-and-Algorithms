class guardwall{
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        char[][] grid = new char[m][n];
        // Step 1: mark guards and walls
        for (int i = 0; i < guards.length; i++) {
            int r = guards[i][0], c = guards[i][1];
            grid[r][c] = 'G';
        }
        for (int i = 0; i < walls.length; i++) {
            int r = walls[i][0],c = walls[i][1];
            grid[r][c] = 'W';
        }
        // Step 2: for each guard, mark visible cells in all 4 directions
        int[][] dir = { {1,0}, {-1,0}, {0,1}, {0,-1} }; // down, up, right, left
        for (int i = 0; i < guards.length; i++) {
            int gx = guards[i][0],gy = guards[i][1];
            for (int d = 0; d < 4; d++) {
                int x = gx + dir[d][0],y = gy + dir[d][1];
                while (x >= 0 && y >= 0 && x < m && y < n) {
                    if (grid[x][y] == 'W' || grid[x][y] == 'G')  break; // stop if wall or guard
                    if (grid[x][y] == 0) grid[x][y] = 'V'; // mark visible
                    x += dir[d][0];
                    y += dir[d][1];
                }
            }
        }
        // Step 3: count unguarded cells
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) count++;
            }
        }
        return count;
    }
}