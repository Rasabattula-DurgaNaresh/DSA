package com.durga.Geek_For_Geeks.Arrays;

/**
 * created 20/04/2021 - 9:57 AM
 *
 * @author DurganNaresh
 *
 * Find the pivot element of the sorted and the rotated array.
 * The pivot element is the largest element in the array.
 * The smallest element will be adjacent to it.
 * Use two pointers (say left and right) with the left pointer pointing to the smallest element
 * and the right pointer pointing to largest element.
 * Find the sum of the elements pointed by both the pointers.
 * If the sum is equal to x, then increment the count.
 * If the sum is less than x, then to increase sum move the left pointer to next position by
 * incrementing it in a rotational manner.
 * If the sum is greater than x, then to decrease sum move the right pointer to next position by
 * decrementing it in rotational manner.
 * Repeat step 3 and 4 until the left pointer is not equal to the right pointer or until the left
 * pointer is not equal to right pointer – 1.
 * Print final count.
 *
 *
 */
public class Sorted_And_Rotated_Array_Find_If_There_is_A_Pair_With_A_Given_Sum_Method1 {
    // This function returns
// count of number of pairs
// with sum equals to x.
    static int pairsInSortedRotated(int arr[],
                                    int n, int x)
    {
        // Find the pivot element.
        // Pivot element is largest
        // element of array.
        int i;
        for (i = 0; i < n - 1; i++)
            if (arr[i] > arr[i + 1])
                break;

        // l is index of
        // smallest element.
        int l = (i + 1) % n;

        // r is index of
        // largest element.
        int r = i;

        // Variable to store
        // count of number
        // of pairs.
        int cnt = 0;

        // Find sum of pair
        // formed by arr[l]
        // and arr[r] and
        // update l, r and
        // cnt accordingly.
        while (l != r)
        {
            // If we find a pair with
            // sum x, then increment
            // cnt, move l and r to
            // next element.
            if (arr[l] + arr[r] == x)
            {
                cnt++;

                // This condition is required
                // to be checked, otherwise
                // l and r will cross each
                // other and loop will never
                // terminate.
                if(l == (r - 1 + n) % n)
                {
                    return cnt;
                }

                l = (l + 1) % n;
                r = (r - 1 + n) % n;
            }

            // If current pair sum
            // is less, move to
            // the higher sum side.
            else if (arr[l] + arr[r] < x)
                l = (l + 1) % n;

                // If current pair sum
                // is greater, move
                // to the lower sum side.
            else
                r = (n + r - 1) % n;
        }

        return cnt;
    }

    // Driver Code
    public static void main (String[] args)
    {
        int arr[] = {11, 15, 6, 7, 9, 10};
        int sum = 16;
        int n = arr.length;

        System.out.println(
                pairsInSortedRotated(arr, n, sum));
    }
}
