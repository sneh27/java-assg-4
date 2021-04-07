package SnehAashishGupta.Assignment4;

import java.util.Scanner;

public class Q1_PascalTriangleRecursion {
    private static int pascal(int rows, int cols) {
        if ((cols == 0) || (cols == rows)) return 1;
            //Value of last and first cell is 1
        else {
            return pascal(rows-1,cols-1) + pascal(rows - 1, cols);
                //Value of curr_cell is the sum of corresponding last 2 val in prev row
        }
    }

    private static void generateTriangle(int n) {
        for (int i = 0; i<n; i++) {
            //Iterate row by row
            for (int j = 0; j <= i; j++) {
                //Each row has cells equal to its row number
                System.out.print(pascal(i,j) + " ");
                    //Printing pascal row
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the height of Pascal Triangle: ");
        int n = s.nextInt();
        generateTriangle(n);
    }
}
