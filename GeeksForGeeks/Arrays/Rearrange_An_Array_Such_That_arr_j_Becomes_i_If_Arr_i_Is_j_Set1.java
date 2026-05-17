package com.durga.Geek_For_Geeks.Arrays;

/**
 * created 20/04/2021 - 12:23 PM
 *
 * @author DurganNaresh
 *
 * Example 1:
 * Input: arr[]  = {1, 3, 0, 2};
 * Output: arr[] = {2, 0, 3, 1};
 * Explanation for the above output.
 * Since arr[0] is 1, arr[1] is changed to 0
 * Since arr[1] is 3, arr[3] is changed to 1
 * Since arr[2] is 0, arr[0] is changed to 2
 * Since arr[3] is 2, arr[2] is changed to 3
 *
 * Example 2:
 * Input: arr[]  = {2, 0, 1, 4, 5, 3};
 * Output: arr[] = {1, 2, 0, 5, 3, 4};
 *
 * Example 3:
 * Input: arr[]  = {0, 1, 2, 3};
 * Output: arr[] = {0, 1, 2, 3};
 *
 * Example 4:
 * Input: arr[]  = {3, 2, 1, 0};
 * Output: arr[] = {3, 2, 1, 0};
 *
 *
 */
public class Rearrange_An_Array_Such_That_arr_j_Becomes_i_If_Arr_i_Is_j_Set1 {
    // A simple method to rearrange 'arr[0..n-1]' so that 'arr[j]'
    // becomes 'i' if 'arr[i]' is 'j'
    void rearrangeNaive(int arr[], int n)
    {
        // Create an auxiliary array of same size
        int temp[] = new int[n];
        int i;

        // Store result in temp[]
        for (i = 0; i < n; i++)
            temp[arr[i]] = i;

        // Copy temp back to arr[]
        for (i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    // A utility function to print contents of arr[0..n-1]
    void printArray(int arr[], int n)
    {
        int i;
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        Rearrange_An_Array_Such_That_arr_j_Becomes_i_If_Arr_i_Is_j_Set1 arrange = new Rearrange_An_Array_Such_That_arr_j_Becomes_i_If_Arr_i_Is_j_Set1();
        int arr[] = { 1, 3, 0, 2 };
        int n = arr.length;

        System.out.println("Given array is ");
        arrange.printArray(arr, n);

        arrange.rearrangeNaive(arr, n);

        System.out.println("Modified array is ");
        arrange.printArray(arr, n);
    }
}
