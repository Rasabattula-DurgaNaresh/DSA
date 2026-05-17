package com.durga.Geek_For_Geeks.Arrays;

/**
 * created 20/04/2021 - 10:49 AM
 *
 * @author DurganNaresh
 *
 * Input : arr[] = {12, 10, 5, 6, 52, 36}
 *             k = 2
 * Output : arr[] = {5, 6, 52, 36, 12, 10}
 * Explanation : Split from index 2 and first
 * part {12, 10} add to the end .
 *
 * Input : arr[] = {3, 1, 2}
 *            k = 1
 * Output : arr[] = {1, 2, 3}
 * Explanation : Split from index 1 and first
 * part add to the end.
 *
 *
 */
public class Split_The_Array_And_Add_The_First_Part_To_The_End {
    public static void splitArr(int arr[], int n, int k)
    {
        for (int i = 0; i < k; i++) {

            // Rotate array by 1.
            int x = arr[0];
            for (int j = 0; j < n - 1; ++j)
                arr[j] = arr[j + 1];
            arr[n - 1] = x;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 12, 10, 5, 6, 52, 36 };
        int n = arr.length;
        int position = 2;

        splitArr(arr, 6, position);

        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
    }
}
