public class Solution {
  public int[][] spiralGenerate(int n) {
    // Write your solution here
      int[][] matrix = new int[n][n];
      if (n == 0) {
        return matrix;
      }
    
      int dir = 1;
      int count = 1;
      int numOfElements = matrix.length * matrix[0].length;
      int left = 0;
      int right = matrix[0].length - 1;
      int top = 0;
      int bottom = matrix.length - 1;

      while (count <= numOfElements) {
        if (dir == 1) {
          for (int i=left; i<=right && count <= numOfElements; i++) {
            matrix[top][i] = count;
            count++;
          }

          dir = 2;
          top++;
        }
        else if (dir == 2) {
          for (int i=top; i<=bottom && count <= numOfElements; i++) {
            matrix[i][right] = count;
            count++;
          }

          dir = 3;
          right--;
        }
        else if (dir == 3) {
          for (int i=right; i>=left && count <= numOfElements; i--) {
            matrix[bottom][i] = count;
            count++;
          }

          dir = 4;
          bottom--;
        }
        else if (dir == 4) {
          for (int i=bottom; i>=top && count <= numOfElements; i--) {
            matrix[i][left] = count;
            count++;
          }

          dir = 1;
          left++;
        }
      }

      return matrix;
  }
}

