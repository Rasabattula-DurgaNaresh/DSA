package com.durga.Geek_For_Geeks.Arrays;

import java.util.Arrays;

/**
 * created 20/04/2021 - 10:59 AM
 *
 * @author DurganNaresh
 */
public class Rearrange_An_Array_Such_That_arri_Equals_i_Method2 {
    public static void main(String[] args)
    {
        int[] arr = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
        for (int i = 0; i < arr.length;)
        {
            if (arr[i] >= 0 && arr[i] != i)
            {
                int ele = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = ele;
            }
            else
            {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
