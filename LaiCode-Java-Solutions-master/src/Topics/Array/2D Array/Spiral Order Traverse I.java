public class Solution {
    public List<Integer> spiral(int[][] matrix) {
      // Write your solution here
      List<Integer> list = new ArrayList<>();

      int dir = 1;
      int count = 0;
      int numOfElements = matrix.length * matrix[0].length;
      int left = 0;
      int right = matrix[0].length - 1;
      int top = 0;
      int bottom = matrix.length - 1;

      while (count < numOfElements) {
        if (dir == 1) {
          for (int i=left; i<=right && count <= numOfElements; i++) {
            list.add(matrix[top][i]);
            count++;
          }

          dir = 2;
          top++;
        }
        else if (dir == 2) {
          for (int i=top; i<=bottom && count <= numOfElements; i++) {
            list.add(matrix[i][right]);
            count++;
          }

          dir = 3;
          right--;
        }
        else if (dir == 3) {
          for (int i=right; i>=left && count <= numOfElements; i--) {
            list.add(matrix[bottom][i]);
            count++;
          }

          dir = 4;
          bottom--;
        }
        else if (dir == 4) {
          for (int i=bottom; i>=top && count <= numOfElements; i--) {
            list.add(matrix[i][left]);
            count++;
          }

          dir = 1;
          left++;
        }
      }

      return list;
    }
}

