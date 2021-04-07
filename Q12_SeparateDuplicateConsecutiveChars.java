package SnehAashishGupta.Assignment4;

import java.util.Scanner;

public class Q12_SeparateDuplicateConsecutiveChars {
    static void dup(String s, int len, String res, int idx, int p) {
        if (idx == len-1) {
            res = res + s.substring(p,len);
            System.out.println(res);
            return;
        }
        if (s.charAt(idx) == s.charAt(idx+1)) {
            res = res + s.substring(p,idx+1) + "-" + s.substring(idx+1);
            dup(s,len,res,idx+1,idx+2);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string adjacent duplicates are to be separated: ");
        String input = scn.nextLine();
        dup(input, input.length(), "", 0, 0);
    }
}
/*
Python Equivalent:
def dup(str, n, new="", index=0, p=0):
    if index == n-1:
        new = new + str[p:n]
        print(new)
        return
    if str[index] == str[index+1]:
        new = new + str[p:index+1] + “*” + str[index+1]
        p = index+2
        dup(str, n, new, index+1, p)

dup(“hello”, 5)
 */