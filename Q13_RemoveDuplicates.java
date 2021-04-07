package SnehAashishGupta.Assignment4;

import java.util.Scanner;

public class Q13_RemoveDuplicates {
    static String removeDup(String s, String res) {
        int n = s.length();
        if (n <= 1) {
            res = s;
            return res;
        }
        else {
            if (s.charAt(0) == s.charAt(1))
                return removeDup(s.substring(2,n),res);
            else
                return removeDup(s.substring(1,n),res+s.charAt(0));
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.nextLine();
        String removedDup = removeDup(str, "");
        System.out.print("The string after removing duplicates is: "+removedDup);
    }
}
/*
Approach:-
1. If string is empty return
2. Else compare the adjacent characters of the string.
If they are the same then shift the characters
one by one to the left. Call recursion on string S.
3. If they aren't same then call recursion from S+1 string.
Recurrence Tree:-
aabcca
|       S = aabcca
abcca
|       S = abcca
bcca
|       S = abcca
cca
|       S = abcca
ca
|       S = abca
a
|       S = abca [output]
(Empty)
 */
