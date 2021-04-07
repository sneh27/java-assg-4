package SnehAashishGupta.Assignment4;

import java.util.Scanner;

public class Q3_LastIndexOfTargetInArray {
    private static int LastIndexOfTarget(int[] arr, int target, int size) {
        if (size < 1) return -1;
        size--;
        if (arr[size] == target) return size;
        return LastIndexOfTarget(arr,target,size);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = {0,0,1,2,3,2,3,14,5,62,7,63,3,2,1,6,0,86,324,23,98};
        int target = 0;
        System.out.println(LastIndexOfTarget(arr,target,arr.length));
    }
}
