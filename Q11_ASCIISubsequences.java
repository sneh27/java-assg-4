package SnehAashishGupta.Assignment4;

import java.util.Scanner;

public class Q11_ASCIISubsequences {
    static void findSub(String str, String res, int i) {
        if (i == str.length()) {
            if (res.length() > 0) {
                System.out.print(res + " ");
            }
            return;
        }
        char ch = str.charAt(i);
        findSub(str,res,i+1);
        findSub(str,res+ch,i+1);
        findSub(str,res+(int)ch,i+1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string whose ASCII subsequences is required: ");
        String input = scn.nextLine();
        /*
        Recurring Operations:
        1 -> Include ith character of input in a subsequence
        2 -> Don't include ith character of input in a subsequence
        3 -> Include the ASCII value of ith character of str in a subsequence
         */
        int n = input.length();
        String res = "";
        System.out.println("The ASCII subsequences of "+input+" are:");
        findSub(input, res, 0);
    }
}
