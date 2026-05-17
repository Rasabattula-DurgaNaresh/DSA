package com.durga.Geek_For_Geeks.Arrays;

/**
 * created 20/04/2021 - 12:34 PM
 *
 * @author DurganNaresh
 */
public class Move_All_Negative_Elements_To_End_in_Order_With_Extra_Space_Allowed {
    // Moves all -ve element to end of array in
    // same order.
    static void segregateElements(int arr[], int n)
    {

        // Create an empty array to store result
        int temp[] = new int[n];

        // Traversal array and store +ve element in
        // temp array
        int j = 0; // index of temp

        for (int i = 0; i < n; i++)
            if (arr[i] >= 0)
                temp[j++] = arr[i];

        // If array contains all positive or all
        // negative.
        if (j == n || j == 0)
            return;

        // Store -ve element in temp array
        for (int i = 0; i < n; i++)
            if (arr[i] < 0)
                temp[j++] = arr[i];

        // Copy contents of temp[] to arr[]
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    // Driver code
    public static void main(String arg[])
    {
        int arr[] = { 1, -1, -3, -2, 7, 5, 11, 6 };
        int n = arr.length;

        segregateElements(arr, n);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
