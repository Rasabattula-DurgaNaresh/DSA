package com.durga.Geek_For_Geeks.Arrays;

/**
 * created 20/04/2021 - 10:34 AM
 *
 * @author DurganNaresh
 */
public class Maximum_Sum_Of_Among_All_Rotations_Of_A_Given_Array_Method2 {
    // function definition
    static int maxSum(int arr[], int n)
    {
        int sum = 0;
        int i;
        int pivot = findPivot(arr, n);

        // difference in pivot and index of
        // last element of array
        int diff = n - 1 - pivot;
        for(i = 0; i < n; i++)
        {
            sum= sum + ((i + diff) % n) * arr[i];
        }
        return sum;
    }

    // function to find pivot
    static int findPivot(int arr[], int n)
    {
        int i;
        for(i = 0; i < n; i++)
        {
            if(arr[i] > arr[(i + 1) % n])
                return i;
        }
        return 0;
    }

    // Driver code
    public static void main(String args[])
    {
        // rotated input array
        int arr[] = {8, 3, 1, 2};
        int n = arr.length;
        int max = maxSum(arr,n);
        System.out.println(max);

    }
}
