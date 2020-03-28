package test;

import java.util.Scanner;
import java.util.stream.LongStream;

public class VeryBigSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextLong();
        }
        System.out.println("Result = " + aVeryBigSum(n,arr) );

    }

    public static long aVeryBigSum(int n, long[] ar){
        long sum = LongStream.of(ar).sum();
        return sum;
    }
}
