package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 8:57 AM
 *
 * Given a 2D array, print it in spiral form. See the following examples.
 *
 * Examples:
 *
 * Input:  1    2   3   4
 *         5    6   7   8
 *         9   10  11  12
 *         13  14  15  16
 * Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 * Explanation: The output is matrix in spiral format.
 *
 * Input:  1   2   3   4  5   6
 *         7   8   9  10  11  12
 *         13  14  15 16  17  18
 * Output: 1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11
 * Explanation :The output is matrix in spiral format.
 * @author DurganNaresh
 */
public class Print_Given_Matrix_In_Spiral_Form {
    public static void main(String[] args) {
    // Function to print in spiral order
    int a[][]={{1,2,3},{4,5,6},{7,8,9}};
    int w = 0;
    int x = a.length-1;
    int y = 0;
    int z = a[0].length-1;
      while(w <= x && y <= z){
        for (int i = w; i <= z; i++) {
            System.out.print(a[w][i] + " ");
        }
        for (int i = w+1; i <= x; i++) {
            System.out.print(a[i][z] + " ");
        }
        if(w+1 <= x){
            for (int i = z-1; i >= y; i--) {
                System.out.print(a[x][i] + " ");
            }
        }
        if(y+1 <= z){
            for (int i = x-1; i > w; i--) {
                System.out.print(a[i][y] + " ");
            }
        }
        w++;
        x--;
        y++;
        z--;
    }
}


}
