package com.durga.Geek_For_Geeks.Arrays;

/**
 * created 20/04/2021 - 10:35 AM
 *
 * @author DurganNaresh
 *
 * Input : arr[] = {15, 18, 2, 3, 6, 12}
 * Output: 2
 * Explanation : Initial array must be {2, 3,
 * 6, 12, 15, 18}. We get the given array after
 * rotating the initial array twice.
 *
 * Input : arr[] = {7, 9, 11, 12, 5}
 * Output: 4
 *
 * Input: arr[] = {7, 9, 11, 12, 15};
 * Output: 0
 *
 *
 */
public class Find_The_Rotation_Count_In_Rotated_Sorted_Array_LinearSearch {
    // Returns count of rotations for an
    // array which is first sorted in
    // ascending order, then rotated
    static int countRotations(int arr[], int n)
    {
        // We basically find index of minimum
        // element
        int min = arr[0], min_index = -1;
        for (int i = 0; i < n; i++)
        {
            if (min > arr[i])
            {
                min = arr[i];
                min_index = i;
            }
        }
        return min_index;
    }

    // Driver program to test above functions
    public static void main (String[] args)
    {
        int arr[] = {15, 18, 2, 3, 6, 12};
        int n = arr.length;

        System.out.println(countRotations(arr, n));
    }
}
