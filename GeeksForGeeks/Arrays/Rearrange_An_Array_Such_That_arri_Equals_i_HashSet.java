package com.durga.Geek_For_Geeks.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * created 20/04/2021 - 10:59 AM
 *
 * @author DurganNaresh
 */
public class Rearrange_An_Array_Such_That_arri_Equals_i_HashSet {
    // Function to rearrange an array
    // such that arr[i] = i.
    public static int[] fix(int[] A)
    {
        Set<Integer> s = new HashSet<Integer>();

        // Storing all the values in the HashSet
        for(int i = 0; i < A.length; i++)
        {
            s.add(A[i]);
        }

        for(int i = 0; i < A.length; i++)
        {
            if(s.contains(i))
                A[i] = i;
            else
                A[i] = -1;
        }

        return A;
    }

    // Driver code
    public static void main(String[] args)
    {
        int A[] = {-1, -1, 6, 1, 9,
                3, 2, -1, 4,-1};

        // Function calling
        System.out.println(Arrays.toString(fix(A)));
    }
}
