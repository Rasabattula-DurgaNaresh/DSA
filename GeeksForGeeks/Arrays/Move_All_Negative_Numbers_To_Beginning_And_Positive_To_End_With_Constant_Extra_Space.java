package com.durga.Geek_For_Geeks.Arrays;

/**
 * created 20/04/2021 - 12:33 PM
 *
 * @author DurganNaresh
 */
public class Move_All_Negative_Numbers_To_Beginning_And_Positive_To_End_With_Constant_Extra_Space {
    static void rearrange(int arr[], int n)
    {
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    // A utility function to print an array
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;

        rearrange(arr, n);
        printArray(arr, n);
    }
}
