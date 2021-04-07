package SnehAashishGupta.Assignment4;

import java.util.Scanner;

public class Q2_SumOfNaturalNumbers {
    private static int sumUpN(int n) {
        if (n <= 0) return 0;
        return n+sumUpN(n-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value for 'n':-");
        int n = s.nextInt();
        int sum = sumUpN(n);
        System.out.println("The sum from 1 to "+n+" is: "+sum);
    }
}
