package SnehAashishGupta.Assignment4;

import java.util.Scanner;

public class Q9_StringLanguageDefinition {
    private static boolean stringMatches(String s) {
        if (s.length() == 0) return true;
        if (s.charAt(0) != 'a') return false;
        if (s.length() >= 3 && "abb".equals(s.substring(0,3)))
            return stringMatches(s.substring(3));
        else
            return stringMatches(s.substring(1));
    }

    public static void main(String[] args) {
        /*
        Rule 1:- String begins with 'a'
        Rule 2:- Each 'a' is either followed by nothing or 'a' or 'bb'
        Rule 3:- Each 'bb' is followed by nothing or an 'a'
         */
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        System.out.println(stringMatches(input));

    }
}
