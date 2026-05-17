package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:03 PM
 *
 * Find if there is a rectangle in binary matrix with corners as 1
 * Difficulty Level : Hard
 * Last Updated : 01 Feb, 2021
 * There is a given binary matrix, we need to find if there exists any rectangle or square in the given matrix whose all four corners are equal to
 *
 * Examples:
 *
 * Input :
 * mat[][] = { 1 0 0 1 0
 *             0 0 1 0 1
 *             0 0 0 1 0
 *             1 0 1 0 1}
 * Output : Yes
 * as there exists-
 * 1 0 1
 * 0 1 0
 * 1 0
 * @author DurganNaresh
 */
// A brute force approach based CPP program to
// find if there is a rectangle with 1 as corners.
public class FindRectangle {
    // Returns true if there is a rectangle with
    // 1 as corners.
    static boolean isRectangle(int m[][]) {
        // finding row and column size
        int rows = m.length;
        if (rows == 0)
            return false;
        int columns = m[0].length;

        // scanning the matrix
        for (int y1 = 0; y1 < rows; y1++)
            for (int x1 = 0; x1 < columns; x1++)
                // if any index found 1 then try
                // for all rectangles
                if (m[y1][x1] == 1)
                    for (int y2 = y1 + 1; y2 < rows; y2++)
                        for (int x2 = x1 + 1; x2 < columns; x2++)
                            if (m[y1][x2] == 1 && m[y2][x1] == 1 &&
                                    m[y2][x2] == 1)
                                return true;
        return false;
    }

    public static void main(String args[]) {
        int mat[][] = {{1, 0, 0, 1, 0},
                {0, 0, 1, 0, 1},
                {0, 0, 0, 1, 0},
                {1, 0, 1, 0, 1}};
        if (isRectangle(mat))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
