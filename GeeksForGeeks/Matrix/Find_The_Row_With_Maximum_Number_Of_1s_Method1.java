package com.durga.Geek_For_Geeks.Matrix;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * created 30/03/2021 - 10:47 PM
 *
 * @author DurganNaresh
 */
public class Find_The_Row_With_Maximum_Number_Of_1s_Method1 {
    // Function to find and display the row with maximum number of 1's
    static void printRow(int[][] matrix) {
        int i, j, rownumber = -1;
        int leftmost = -1;
        for (i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 1) {
                rownumber = 0;
                leftmost = i;
                break;
            }
        }
        if (leftmost == -1) {
            leftmost = matrix[0].length;
        }
        for (i = 1; i < matrix[0].length; i++) {
            int x = leftmost - 1;
            while (x >= 0 && matrix[i][x] == 1) {
                rownumber = i;
                leftmost = x;
                x--;
            }
        }
        if (rownumber != -1) {
            System.out.println("Row with maximum number of" +
                    "One's in Sorted Matrix is");
            for (i = 0; i < matrix[rownumber].length; i++) {
                System.out.print(matrix[rownumber][i] + " ");
            }
        } else {
            System.out.println("There is no row containing 1's");
        }
    }
    //Main Function to read input
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rows,columns;
        try{
            System.out.println("Enter the number of rows");
            rows = Integer.parseInt(br.readLine());
            System.out.println("Enter the number of columns");
            columns = Integer.parseInt(br.readLine());
        }
        catch(Exception e){
            System.out.println("An error occurred");
            return;
        }
        int[][] matrix = new int[rows][columns];
        int i,j,prev;
        prev=Integer.MIN_VALUE;
        System.out.println("Enter the Boolean Matrix");
        try{
            for(i=0; i<rows; i++){
                for(j=0; j<columns; j++){
                    matrix[i][j] = Integer.parseInt(br.readLine());
                }
            }
        }catch (Exception e){
            System.out.println("An error occurred");
            return;
        }
        System.out.println("The matrix is");
        for(i=0; i<rows; i++){
            for(j=0; j<columns; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        if(rows > 0 && columns > 0)
            printRow(matrix);
    }
}
