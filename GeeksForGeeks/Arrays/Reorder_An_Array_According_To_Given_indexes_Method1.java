package com.durga.Geek_For_Geeks.Arrays;

import java.util.Arrays;

/**
 * created 20/04/2021 - 12:10 PM
 *
 * @author DurganNaresh
 */
public class Reorder_An_Array_According_To_Given_indexes_Method1 {
    static int arr[] = new int[]{50, 40, 70, 60, 90};
    static int index[] = new int[]{3,  0,  4,  1,  2};

    // Method to reorder elements of arr[] according
    // to index[]
    static void reorder()
    {
        // Fix all elements one by one
        for (int i=0; i<arr.length; i++)
        {
            // While index[i] and arr[i] are not fixed
            while (index[i] != i)
            {
                // Store values of the target (or correct)
                // position before placing arr[i] there
                int  oldTargetI  = index[index[i]];
                char oldTargetE  = (char)arr[index[i]];

                // Place arr[i] at its target (or correct)
                // position. Also copy corrected index for
                // new position
                arr[index[i]] = arr[i];
                index[index[i]] = index[i];

                // Copy old target values to arr[i] and
                // index[i]
                index[i] = oldTargetI;
                arr[i]   = oldTargetE;
            }
        }
    }

    // Driver method to test the above function
    public static void main(String[] args)
    {

        reorder();

        System.out.println("Reordered array is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Modified Index array is:");
        System.out.println(Arrays.toString(index));

    }
}
