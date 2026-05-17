package com.durga.Geek_For_Geeks.Arrays;

/**
 * created 20/04/2021 - 10:54 AM
 *
 * @author DurganNaresh
 */
public class Split_The_Array_And_Add_The_First_Part_To_The_End_Method1 {
    // Function to spilt array and
    // move first part to end
    public static void SplitAndAdd(int[] A,int length,int rotation){

        //make a temporary array with double the size
        int[] tmp = new int[length*2];

        // copy array element in to new array twice
        System.arraycopy(A, 0, tmp, 0, length);
        System.arraycopy(A, 0, tmp, length, length);
        for(int i=rotation;i<rotation+length;i++)
            A[i-rotation]=tmp[i];
    }


    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 12, 10, 5, 6, 52, 36 };
        int n = arr.length;
        int position = 2;

        SplitAndAdd(arr, n, position);

        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
    }
}
