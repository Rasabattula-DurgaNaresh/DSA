package com.durga.Geek_For_Geeks.Arrays;

/**
 * created 20/04/2021 - 12:30 PM
 *
 * @author DurganNaresh
 *
 * even index : remaining maximum element.
 * odd index  : remaining minimum element.
 *
 * max_index : Index of remaining maximum element
 *             (Moves from right to left)
 * min_index : Index of remaining minimum element
 *             (Moves from left to right)
 *
 * Initialize: max_index = 'n-1'
 *             min_index = 0
 *             max_element = arr[max_index] + 1 //can be any element which is more than the maximum value in array
 *
 * For i = 0 to n-1
 *     If 'i' is even
 *        arr[i] += arr[max_index] % max_element * max_element
 *        max_index--
 *     ELSE // if 'i' is odd
 *        arr[i] +=  arr[min_index] % max_element * max_element
 *        min_index++
 *
 */
public class Rearrange_An_Array_In_Maximum_Minimum_Form_Set1_ExtraSpace {
    // Prints max at first position, min at second
    // position second max at third position, second
    // min at fourth position and so on.
    public static void rearrange(int arr[], int n)
    {
        // initialize index of first minimum and first
        // maximum element
        int max_idx = n - 1, min_idx = 0;

        // store maximum element of array
        int max_elem = arr[n - 1] + 1;

        // traverse array elements
        for (int i = 0; i < n; i++) {
            // at even index : we have to put
            // maximum element
            if (i % 2 == 0) {
                arr[i] += (arr[max_idx] % max_elem) * max_elem;
                max_idx--;
            }

            // at odd index : we have to put minimum element
            else {
                arr[i] += (arr[min_idx] % max_elem) * max_elem;
                min_idx++;
            }
        }

        // array elements back to it's original form
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] / max_elem;
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;

        System.out.println("Original Array");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        rearrange(arr, n);

        System.out.print("\nModified Array\n");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
