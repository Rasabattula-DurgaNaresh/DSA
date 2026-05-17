package com.durga.Geek_For_Geeks.Arrays;

/**
 * created 20/04/2021 - 12:15 PM
 *
 * @author DurganNaresh
 */
public class Rearrange_Positive_And_Negative_Numbers_With_Constant_Extra_Space_Method3 {
    public static void RearrangePosNeg(int arr[])
    {
        int i=0;
        int j=arr.length-1;
        while(true)
        {
            // Loop until arr[i] < 0 and
            // still inside the array
            while(arr[i]<0 && i<arr.length)
                i++;

            // Loop until arr[j] > 0 and
            // still inside the array
            while(arr[j]>0 && j>=0)
                j--;

            // if i is less than j
            if(i<j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            else
                break;
        }
    }

    // Driver Code
    public static void main (String[] args)
    {
        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        RearrangePosNeg(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
