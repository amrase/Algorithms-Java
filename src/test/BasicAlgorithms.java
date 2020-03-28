package test;

import java.util.List;
import java.util.Arrays;
import java.util.List;

public class BasicAlgorithms {

//    Given an array of integers, find the sum of its elements.
//    For example, if the array , a =[1,2,3] return 6, so return .
    public static int arraySum(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
        return sum;
    }

    public static List<Integer> compareTriplets(int[] a, int[] b){
        int countA =0;
        int countB=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>b[i]){
                countA++;
            }
            else if(a[i]<b[i]){
                countB++;
            }
        }
        return Arrays.asList(countA,countB);
    }


    public static long aVeryLongSum(long[] arr){
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
}
