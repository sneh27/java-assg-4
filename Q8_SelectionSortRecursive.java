package SnehAashishGupta.Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class Q8_SelectionSortRecursive {
    static int minIndex(int[] arr, int i, int j) {
        if (i == j) return i;
        int k = minIndex(arr,i+1,j);
        return (arr[i] < arr[k])?i:k;
    }
    static void selectionSortRecursive(int[] arr, int size, int idx) {
        if (idx == size) return;
        int k = minIndex(arr,idx,size-1);
        if (k != idx) {
            int temp = arr[k];
            arr[k] = arr[idx];
            arr[idx] = temp;
        }
        selectionSortRecursive(arr, size, idx+1);
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
        /*
        Selection Sort Normal
        for (int i = 0; i < n; i++) {
            min = i;
            for (int j = i+1; j < n; j++) {
                if (a[j] < a[min]) min = j;
                if (i != min) {
                    temp = a[min]
                    a[min] = a[i]
                    a[i] = temp;
                }
            }
        }
         */
        selectionSortRecursive(arr,size,0);
        System.out.println(Arrays.toString(arr));
    }
}
