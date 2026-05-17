package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:05 PM
 *
 * We have one 2D array, filled with zeros and ones. We have to find the starting point and ending point of all rectangles filled with 0. It is given that rectangles are separated and do not touch each other however they can touch the boundary of the array.A rectangle might contain only one element.
 * Examples:
 *
 *
 * input = [
 *             [1, 1, 1, 1, 1, 1, 1],
 *             [1, 1, 1, 1, 1, 1, 1],
 *             [1, 1, 1, 0, 0, 0, 1],
 *             [1, 0, 1, 0, 0, 0, 1],
 *             [1, 0, 1, 1, 1, 1, 1],
 *             [1, 0, 1, 0, 0, 0, 0],
 *             [1, 1, 1, 0, 0, 0, 1],
 *             [1, 1, 1, 1, 1, 1, 1]
 *         ]
 *
 *
 * Output:
 * [
 *   [2, 3, 3, 5], [3, 1, 5, 1], [5, 3, 6, 5]
 * ]
 *
 * Explanation:
 * We have three rectangles here, starting from
 * (2, 3), (3, 1), (5, 3)
 *
 * Input = [
 *             [1, 0, 1, 1, 1, 1, 1],
 *             [1, 1, 0, 1, 1, 1, 1],
 *             [1, 1, 1, 0, 0, 0, 1],
 *             [1, 0, 1, 0, 0, 0, 1],
 *             [1, 0, 1, 1, 1, 1, 1],
 *             [1, 1, 1, 0, 0, 0, 0],
 *             [1, 1, 1, 1, 1, 1, 1],
 *             [1, 1, 0, 1, 1, 1, 0]
 *         ]
 *
 *
 * Output:
 * [
 *   [0, 1, 0, 1], [1, 2, 1, 2], [2, 3, 3, 5],
 *   [3, 1, 4, 1], [5, 3, 5, 6], [7, 2, 7, 2],
 *   [7, 6, 7, 6]
 * ]
 * @author DurganNaresh
 */
public class Find_All_Rectangles_Filled_With_0 {

}
