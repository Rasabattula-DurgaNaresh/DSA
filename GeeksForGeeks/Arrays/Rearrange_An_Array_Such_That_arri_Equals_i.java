package com.durga.Geek_For_Geeks.Arrays;

/**
 * created 20/04/2021 - 10:57 AM
 *
 * @author DurganNaresh
 */
public class Rearrange_An_Array_Such_That_arri_Equals_i {
    // Function to tranform the array
    public static void fixArray(int ar[], int n)
    {
        int i, j, temp;

        // Iterate over the array
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++)
            {

                // Checf is any ar[j]
                // exists such that
                // ar[j] is equal to i
                if (ar[j] == i)
                {
                    temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                    break;
                }
            }
        }

        // Iterate over array
        for(i = 0; i < n; i++)
        {

            // If not present
            if (ar[i] != i)
            {
                ar[i] = -1;
            }
        }

        // Print the output
        System.out.println("Array after Rearranging");
        for(i = 0; i < n; i++)
        {
            System.out.print(ar[i] + " ");
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int n, ar[] = { -1, -1, 6, 1, 9,
                3, 2, -1, 4, -1 };
        n = ar.length;

        // Function Call
        fixArray(ar, n);
    }
}
