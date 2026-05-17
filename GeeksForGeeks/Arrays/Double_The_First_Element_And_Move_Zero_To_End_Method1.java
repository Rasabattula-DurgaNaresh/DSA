package com.durga.Geek_For_Geeks.Arrays;

/**
 * created 20/04/2021 - 11:35 AM
 *
 * @author DurganNaresh
 */
public class Double_The_First_Element_And_Move_Zero_To_End_Method1 {
    // Function For Swaping Two Element Of An Array
    public static void swap(int[] A, int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    // shift all zero to left side of an array
    static void shiftAllZeroToLeft(int array[], int n)
    {
        // Maintain last index with positive value
        int lastSeenNonZero = 0;

        for (int index = 0; index < n; index++) {
            // If Element is non-zero
            if (array[index] != 0) {
                // swap current index, with lastSeen
                // non-zero
                swap(array, array[index],
                        array[lastSeenNonZero]);

                // next element will be last seen non-zero
                lastSeenNonZero++;
            }
        }
    }
}
