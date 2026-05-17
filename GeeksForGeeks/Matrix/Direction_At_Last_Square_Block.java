package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 10:20 AM
 *
 * Direction at last square block
 * Difficulty Level : Hard
 * Last Updated : 27 Feb, 2019
 * Given a R x C (1 <= R, C <= 1000000000) grid and initial position as top left corner and direction as east. Now we start running in forward direction and cross each square blocks of matrix. Whenever we find dead end or reach a cell that is already visited, we take right because we can not cross the visited square blocks again. Tell the direction when we will be at last square block.
 *
 * For example : Consider the case with R = 3, C = 3. The path followed will be (0, 0) — (0, 1) — (0, 2) — (1, 2) — (2, 2) — (2, 1) — (2, 0) — (1, 0) — (1, 1). At this point, all squares have been visited, and is facing right.
 * Examples :
 *
 * Input  :  R = 1, C = 1
 * Output :  Right
 *
 * Input   :  R = 2, C = 2
 * Output  :  Left
 *
 * Input   :  R = 3, C = 1
 * Output  :  Down
 *
 * Input  :  R = 3, C = 3
 * Output :  Right
 *
 * @author DurganNaresh
 */
public class Direction_At_Last_Square_Block {
    // Function which tells the Current direction
    static void direction(int R, int C)
    {
        if (R != C && R % 2 == 0 && C % 2 != 0 && R < C) {
            System.out.println("Left");
            return;
        }
        if (R != C && R % 2 != 0 && C % 2 == 0 && R > C) {
            System.out.println("Up");
            return;
        }
        if (R == C && R % 2 != 0 && C % 2 != 0) {
            System.out.println("Right");
            return;
        }
        if (R == C && R % 2 == 0 && C % 2 == 0) {
            System.out.println("Left");
            return;
        }
        if (R != C && R % 2 != 0 && C % 2 != 0 && R < C) {
            System.out.println("Right");
            return;
        }
        if (R != C && R % 2 != 0 && C % 2 != 0 && R > C) {
            System.out.println("Down");
            return;
        }
        if (R != C && R % 2 == 0 && C % 2 == 0 && R < C) {
            System.out.println("Left");
            return;
        }
        if (R != C && R % 2 == 0 && C % 2 == 0 && R > C) {
            System.out.println("Up");
            return;
        }
        if (R != C && R % 2 == 0 && C % 2 != 0 && R > C) {
            System.out.println("Down");
            return;
        }
        if (R != C && R % 2 != 0 && C % 2 == 0 && R < C) {
            System.out.println("Right");
            return;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int R = 3, C = 1;

        direction(R, C);
    }
}
