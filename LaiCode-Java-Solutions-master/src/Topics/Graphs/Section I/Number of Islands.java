public class Solution {
  public int numIslands(char[][] grid) {
    // Write your solution here
    if (grid.length == 0 || grid[0].length == 0) {
      return 0;
    }
    int count = 0;
    boolean[][] visited = new boolean[grid.length][grid[0].length];
    int nRows = grid.length;
    int nCols = grid[0].length;
    for (int i = 0; i < nRows; i++) {
      for (int j = 0; j < nCols; j++) {
        if (!visited[i][j]) {
          if (grid[i][j] == '1') {
            count++;
            dfs(grid, i, j, nRows, nCols, visited);
          }

          visited[i][j] = true;
        }
      }
    }

    return count;
  }

  private void dfs(char[][] grid, int x, int y, int nRows, int nCols, boolean[][] visited) {
    if (x < 0 || x >= nRows || y < 0 || y >= nCols || visited[x][y]) {
      return;
    }

    if(grid[x][y] == '0') {
      return;
    }

    visited[x][y] = true;

    int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    for (int[] dir : dirs) {
      dfs(grid, x + dir[0], y + dir[1], nRows, nCols, visited);
    }
  }
}

