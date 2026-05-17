package com.durga.Geek_For_Geeks.Arrays;

/**
 * created 20/04/2021 - 12:36 PM
 *
 * @author DurganNaresh
 */
public class Rearrange_Array_Such_That_Even_Index_Elements_Are_Smaller_And_Odd_Index_Elements_Are_Greater {
    static void rearrange(int arr[], int n)
    {

        int temp;
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0 && arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            if (i % 2 != 0 && arr[i] < arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    /* Utility that prints out an array in
    a line */
    static void printArray(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 6, 4, 2, 1, 8, 3 };
        int n = arr.length;

        System.out.print("Before rearranging: \n");
        printArray(arr, n);

        rearrange(arr, n);

        System.out.print("After rearranging: \n");
        printArray(arr, n);
    }
}
