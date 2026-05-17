package com.durga.Geek_For_Geeks.Arrays;

/**
 * created 20/04/2021 - 12:26 PM
 *
 * @author DurganNaresh
 */
public class Rearrange_An_Array_Such_That_arr_j_Becomes_i_If_Arr_i_Is_j_Set1_Method2 {
    // A simple method to rearrange
    // 'arr[0..n-1]' so that 'arr[j]'
    // becomes 'i' if 'arr[i]' is 'j'
    static void rearrange(int arr[], int n)
    {
        for (int i = 0; i < n; i++) {

            // retrieving old value and
            // storing with the new one
            arr[arr[i] % n] += i * n;
        }

        for (int i = 0; i < n; i++) {

            // retrieving new value
            arr[i] /= n;
        }
    }

    // A utility function to print
    // contents of arr[0..n-1]
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 2, 0, 1, 4, 5, 3 };
        int n = arr.length;

        System.out.println("Given array is : ");
        printArray(arr, n);

        rearrange(arr, n);

        System.out.println("Modified array is :");
        printArray(arr, n);
    }
}
