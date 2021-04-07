package SnehAashishGupta.Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class Q7_BubbleSortRecursive {
    /*
    //--SELF ATTEMPT--//
    private static void bubbleSortRecursive(int[] arr, int outer, int inner) {
        if (outer > arr.length) return;
        else {
            if (inner > arr.length - outer - 1)
                bubbleSortRecursive(arr,outer+1,0);
            if (arr[inner] > arr[inner+1]) {
                int temp = arr[inner];
                arr[inner] = arr[inner+1];
                arr[inner+1] = temp;
                bubbleSortRecursive(arr,outer,inner+1);
            }

        }
    }
     */
    static void bubbleSortRecursive(int[] arr, int curr_size) {
        if (curr_size == 1) return;
        for (int i = 0; i < curr_size-1; i++)
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        bubbleSortRecursive(arr,curr_size-1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = scn.nextInt();
        System.out.println("Input numbers for array:");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }
        bubbleSortRecursive(arr,size-1);
        System.out.println("Bubble sorted array is:");
        System.out.println(Arrays.toString(arr));
    }
}
