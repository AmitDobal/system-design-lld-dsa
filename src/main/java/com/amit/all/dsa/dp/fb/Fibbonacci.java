package com.amit.all.dsa.dp.fb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fibbonacci {
    public static void main(String[] args) {
        System.out.println(fibSeries(500));
        System.out.println(fibbonacciSeq(500));
    }

    private static List<Long> fibSeries(int n) {
        List<Long> result = new ArrayList<>();
        long[] dp = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            long f = fibbonacci(i, dp);
            result.add(f);
            System.out.println(i + " - " + f);
        }
        return result;
    }

    private static long fibbonacci(long n, long[] dp) {
        if(dp[(int) n] != 0){
            return dp[(int) n];
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return dp[(int) n] = fibbonacci(n - 1, dp) + fibbonacci(n - 2, dp);
    }

    private static List<Long> fibbonacciSeq(int n) {
       long[] result = new long[n + 1];
       if(n >= 1 ){
           result[1] = (1L);
       }
       if(n >= 2){
           result[2] = (1L);
       }
       for(int i = 3; i <= n; i++){
           result[i] = result[i - 1] + result[i - 2];
       }
       return Arrays.stream(result).boxed().skip(1).collect(Collectors.toCollection(ArrayList::new));
    }
}
