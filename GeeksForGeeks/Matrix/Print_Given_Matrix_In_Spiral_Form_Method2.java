package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 9:19 AM
 *
 * @author DurganNaresh
 */
public class Print_Given_Matrix_In_Spiral_Form_Method2 {

    private static void form_Spiral(int row_start,int row_end,int col_start,int col_end){
        boolean[][] mat = new boolean[0][];
        if(row_start >= row_end || col_start >=col_end)
            return;

        //Print First Row
        for (int p=row_start;p<col_end;p++){
            System.out.println(mat[row_start][p]);
        }

        //Print last Column
        for (int p=row_start+1;p<row_end;p++){
            System.out.println(mat[row_start][p]);
        }
        //Print Last Row,if last and First Row are not same
        if((row_end-1)!=row_start){
            for (int p=col_end-2;p>=col_start;p--){
                System.out.println(mat[row_end-1][p]);
            }
        }

        //Print First column,if last and First Column are not same
        if((col_end-1)!=col_start){
            for (int p=row_end-2;p>=row_start;p--){
                System.out.println(mat[p][col_start]);
            }
        }

        form_Spiral(row_start+1,col_start+1,row_end-1,col_end-1);
    }

    public static void main(String[] args) {

        int a[][] = { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 } };
        form_Spiral(0,4,0,4);
    }
}
