package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 9:19 AM
 *
 * @author DurganNaresh
 */
public class Print_Given_Matrix_In_Spiral_Form_Method1 {

    private static void form_Spiral(int n,int m){
      int row_start=0,col_start=0,row_end=n,col_end=m;
      while (row_start<row_end && col_start<col_end){
          for (int j=col_start;j<col_end;j++){
              boolean[][] mat = new boolean[0][];
              System.out.println(mat[row_start][j]);
          }
          row_start++;

          for (int j=row_start;j<row_end;j++){
              boolean[][] mat = new boolean[0][];
              System.out.println(mat[j][col_end-1]);
          }
          col_end--;

          if(row_start < row_end){
              for (int j=col_end-1;j>=col_start;j--){
                  boolean[][] mat = new boolean[0][];
                  System.out.println(mat[j][col_end-1]);
              }
              row_end--;
          }
          if(col_start < col_end){
              for (int j=row_end-1;j>=row_start;j--){
                  boolean[][] mat = new boolean[0][];
                  System.out.println(mat[j][col_end-1]);
              }
              col_start++;
          }
      }
    }

    public static void main(String[] args) {
        int R = 2;
        int C = 5;
        int a[][] = { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 } };
        form_Spiral(R,C);
    }
}
