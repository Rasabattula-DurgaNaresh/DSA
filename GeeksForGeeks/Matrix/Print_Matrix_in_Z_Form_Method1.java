package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:43 PM
 *
 * @author DurganNaresh
 */
public class Print_Matrix_in_Z_Form_Method1 {
    public static void diag(int arr[][], int n)
    {
        int i = 0, j, k;
        for(i = 0;i < n;i++){
            for(j = 0;j < n;j++){
                if(i == 0){
                    System.out.print(arr[i][j]+" ");
                } else if(i == j){
                    System.out.print(arr[i][j]+" ");
                } else if(i == n-1){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

    }

    public static void main(String[] args)
    {
        int a[][] = { { 4, 5, 6, 8 },
                { 1, 2, 3, 1 },
                { 7, 8, 9, 4 },
                { 1, 8, 7, 5 } };

        diag(a, 4);
    }
}
