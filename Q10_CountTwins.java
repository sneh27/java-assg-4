package SnehAashishGupta.Assignment4;

import java.util.Scanner;

public class Q10_CountTwins {
    public static int countTwins(String s,int i, int j, int n, int count) {
        if (i >= n || j>=n) return count;
        if (j > i+2)
            return countTwins(s,i+1,i+2,n,count);

        char twin1 = s.charAt(i);
        char twin2 = s.charAt(j);

        if (twin1 != twin2) {
            return countTwins(s,i,j+1,n,count);
        } else {
            count++;
            return countTwins(s,i,j+1,n,count);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the input for twins:");
        String input = scn.nextLine();
        int count = 0;
        int result = countTwins(input, 0, 1, input.length(), count);
        System.out.println("The total number of twins are: "+result);
    }
}
