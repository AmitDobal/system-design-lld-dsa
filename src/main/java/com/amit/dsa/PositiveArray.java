package com.amit.dsa;

public class PositiveArray {

    // Returns true if every contiguous subarray of length >= 2 has a nonnegative sum.
    private static boolean isPositive(long[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                // Only check subarrays of length at least 2.
                if (j > i && sum < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // Repeatedly "fix" the array until it is positive.
    // Returns the minimum number of operations required.
    public static int minOperations(long[] arr) {
        int n = arr.length;
        int ops = 0;
        // Repeat until the array satisfies the positive condition.
        while (!isPositive(arr)) {
            // Look for the first contiguous subarray (of length >= 2) that violates the condition.
            for (int i = 0; i < n; i++) {
                long sum = 0;
                for (int j = i; j < n; j++) {
                    sum += arr[j];
                    if (j > i && sum < 0) {
                        // We have found a violation in the subarray from i to j.
                        // Our “fix” is to change arr[i] so that the sum of the subarray i..j becomes zero.
                        // (Since the sum of indices i+1..j is fixed, the optimal choice is:)
                        arr[i] = -(sum - arr[i]);
                        ops++;
                        // Once we fix one violation, break out and re-check the whole array.
                        break;
                    }
                }
                // If after a fix the array is positive, we can stop.
                if (isPositive(arr)) {
                    break;
                }
            }
        }
        return ops;
    }

    // A simple test
    public static void main(String[] args) {
        // Example from the explanation:
        // For arr = [ -5, 2, -1, -1 ]
        // One optimal solution is to change arr[0] and arr[3] so that the final array is [ 0, 2, -1, 1 ].
        // Thus, the minimum number of operations is 2.
//        long[] arr = { -5, 2, -1, -1 };
        long[] arr = { 2, 5, -8, -1, 2 };
        int minOps = minOperations(arr);
        System.out.println("Minimum operations required: " + minOps);
        // For demonstration, also print the fixed array.
        System.out.print("Fixed array: ");
        for (long x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
