package SnehAashishGupta.Assignment4;

import java.io.*;
import java.util.*;

public class Q4_IndicesOfTargetOccurrence {
    /*
    //--SELF ATTEMPT--//
    private static ArrayList<Integer> occurrences = new ArrayList<Integer>();
    private static void FindOccurrences(int arr[], int target, int size, int start) {
        if (start >= size) return;
        if (arr[start] == target) {
            occurrences.add(start);
            FindOccurrences(arr,target, size, start + 1);
        }
    }
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);
        int arr[] = {0,1,2,3,4,5,6,7,8,9,0,1,2,0,0,0,3,54,1,12,9,0,56};
        int target = 0;
        FindOccurrences(arr,target,arr.length,0);
        //Print every element of occurrences ArrayList
        for (Integer occurrence:occurrences) {
            System.out.println(occurrence);
        }
    }
    */
    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if (idx == arr.length) {
            return new int[fsf];
        }
        if (arr[idx]==x) {
            int[] iarr = allIndices(arr,x,idx+1,fsf+1);
            iarr[fsf] = idx;
            return iarr;
        } else {
            int[] iarr = allIndices(arr,x,idx+1,fsf);
            return iarr;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,6,9,8,3,2,3,6,4};
        System.out.println("Given array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Target Value is: ");
        int target = 3;
        System.out.print(target);
        System.out.println();
        //O/P should be:- {1,5,7}
        int occurrences[] = allIndices(arr,target,0,0);
        if (occurrences.length == 0) System.out.println("None Found");
        else {
            System.out.println("The indices of target's occurrence is:-");
            for (int i = 0; i < occurrences.length;i++) {
                System.out.print(occurrences[i]+" ");
            }
            System.out.println();
        }
    }
}
