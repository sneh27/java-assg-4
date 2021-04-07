package SnehAashishGupta.Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class Q14_BalancedBrackets {
    static char findClosing(char start) {
        if (start == '(') return ')';
        if (start == '{') return '}';
        if (start == '[') return ']';
        return Character.MIN_VALUE;
    }
    static boolean check(char[] exp, int n) {
        /*
        Base Cases
         */
        if (n == 0) return true;
        if (n == 1) return false;
        if (exp[0] == ')' || exp[0] == '}' || exp[0] == ']') return false;

        char closing = findClosing(exp[0]);
        int i, count = 0;
        for (i = 1; i < n; i++) {
            if (exp[i] == exp[0]) count++;
            if (exp[i] == closing) {
                if (count == 0) break;
                count--;
            }
        }

        if (i == n) return false;

        if (i == 1) return check(Arrays.copyOfRange(exp,i+1,n),n-2);

        return check(Arrays.copyOfRange(exp,1,n),i-1) && check(Arrays.copyOfRange(exp,i+1, n),n-i-1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the mathematical expression: ");
        String exp = scn.nextLine();
        int n = exp.length();
        if (check(exp.toCharArray(),n))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
