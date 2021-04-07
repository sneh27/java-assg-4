package SnehAashishGupta.Assignment4;

import java.util.Scanner;

public class Q5_ReverseArray {
    private static void reverseArrayRecursion(int[] arr, int start, int end) {
        if (start >= end) return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArrayRecursion(arr,start+1,end-1);
    }

    private static void displayReversed(int[] arr, int idx) {
        if (idx == arr.length) return;
        displayReversed(arr,idx+1);
        System.out.print(arr[idx]+" ");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Displaying reversed array: ");
        displayReversed(arr,0);
        System.out.println();
        reverseArrayRecursion(arr,0,arr.length-1);
        System.out.println("Printing the reversed array:-");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
