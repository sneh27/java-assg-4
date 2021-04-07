package SnehAashishGupta.Assignment4;

import java.util.Scanner;

public class Q15a_SplitArrayWEqualSum {
    /*
    static int countWays(int arr[],int n, int sum) {
        if (n <= 1) return 0;
        int curr_sum = 0, ans = 0;
        for (int i = 0; i < n - 1; i++) {
            curr_sum += arr[i];
            if (sum == sum/2) {
                ans++;
            }
        }
    }
     */
    static int cntWays(int arr[], int n) {
        // if length of array is 1
        // answer will be 0 as we have
        // to split it into two
        // non-empty halves
        if (n == 1)
        {
            return 0;
        }

        // variables to store total sum,
        // current sum and count
        int tot_sum = 0, sum = 0, ans = 0;

        // finding total sum
        for (int i = 0; i < n; i++)
        {
            tot_sum += arr[i];
        }

        // checking if sum equals total_sum/2
        for (int i = 0; i < n - 1; i++)
        {
            sum += arr[i];
            if (sum == tot_sum / 2)
            {
                ans++;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = scn.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            sum += arr[i];
        }
        int ways = cntWays(arr,n);
        System.out.println("The number of ways array can be split into 2 equal sum subsets is: "+ways);
    }
}
