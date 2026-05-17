package com.durga.Geek_For_Geeks.Arrays;

/**
 * created 20/04/2021 - 10:30 AM
 *
 * @author DurganNaresh
 *
 * Let us calculate initial value of i*arr[i] with no rotation
 * R0 = 0*arr[0] + 1*arr[1] +...+ (n-1)*arr[n-1]
 *
 * After 1 rotation arr[n-1], becomes first element of array,
 * arr[0] becomes second element, arr[1] becomes third element
 * and so on.
 * R1 = 0*arr[n-1] + 1*arr[0] +...+ (n-1)*arr[n-2]
 *
 * R1 - R0 = arr[0] + arr[1] + ... + arr[n-2] - (n-1)*arr[n-1]
 *
 * After 2 rotations arr[n-2], becomes first element of array,
 * arr[n-1] becomes second element, arr[0] becomes third element
 * and so on.
 * R2 = 0*arr[n-2] + 1*arr[n-1] +...+ (n-1)*arr[n-3]
 *
 * R2 - R1 = arr[0] + arr[1] + ... + arr[n-3] - (n-1)*arr[n-2] + arr[n-1]
 *
 * If we take a closer look at above values, we can observe
 * below pattern
 *
 * Rj - Rj-1 = arrSum - n * arr[n-j]
 *
 * Where arrSum is sum of all array elements, i.e.,
 *
 * arrSum = ∑ arr[i]
 *         0<=i<=n-1
 *
 * 1) Compute sum of all array elements. Let this sum be 'arrSum'.
 *
 * 2) Compute R0 by doing i*arr[i] for given array.
 *    Let this value be currVal.
 *
 * 3) Initialize result: maxVal = currVal // maxVal is result.
 *
 * // This loop computes Rj from  Rj-1
 * 4) Do following for j = 1 to n-1
 * ......a) currVal = currVal + arrSum-n*arr[n-j];
 * ......b) If (currVal > maxVal)
 *             maxVal = currVal
 *
 * 5) Return maxVal
 */
public class Find_Maximum_Value_Of_Sum_With_Only_Rotations_On_Given_Array_Allowed {
    static int arr[] = new int[]{10, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    // Returns max possible value of i*arr[i]
    static int maxSum()
    {
        // Find array sum and i*arr[i] with no rotation
        int arrSum = 0;  // Stores sum of arr[i]
        int currVal = 0;  // Stores sum of i*arr[i]
        for (int i=0; i<arr.length; i++)
        {
            arrSum = arrSum + arr[i];
            currVal = currVal+(i*arr[i]);
        }

        // Initialize result as 0 rotation sum
        int maxVal = currVal;

        // Try all rotations one by one and find
        // the maximum rotation sum.
        for (int j=1; j<arr.length; j++)
        {
            currVal = currVal + arrSum-arr.length*arr[arr.length-j];
            if (currVal > maxVal)
                maxVal = currVal;
        }

        // Return result
        return maxVal;
    }

    // Driver method to test the above function
    public static void main(String[] args)
    {
        System.out.println("Max sum is " + maxSum());
    }
}
