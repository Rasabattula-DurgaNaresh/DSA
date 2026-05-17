package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:21 PM
 *Inplace (Fixed space) M x N size matrix transpose | Updated
 *
 * About four months of gap (missing GFG), a new post. Given an M x N matrix, transpose the matrix without auxiliary memory.It is easy to transpose matrix using an auxiliary array. If the matrix is symmetric in size, we can transpose the matrix inplace by mirroring the 2D array across it’s diagonal (try yourself). How to transpose an arbitrary size matrix inplace? See the following matrix,
 *
 * a b c       a d g j
 * d e f  ==>  b e h k
 * g h i       c f i l
 * j k l
 * As per 2D numbering in C/C++, corresponding location mapping looks like,
 *
 * Org element New
 *  0     a     0
 *  1     b     4
 *  2     c     8
 *  3     d     1
 *  4     e     5
 *  5     f     9
 *  6     g     2
 *  7     h     6
 *  8     i    10
 *  9     j     3
 *  10    k     7
 *  11    l    11
 * Note that the first and last elements stay in their original location. We can easily see the transformation forms few permutation cycles.
 *
 * 1->4->5->9->3->1  – Total 5 elements form the cycle
 * 2->8->10->7->6->2 – Another 5 elements form the cycle
 * 0  – Self cycle
 * 11 – Self cycle
 * @author DurganNaresh
 */
public class Inplace_Fixed_Space_MN_Size_Matrix_Transpose_Updated {
}
