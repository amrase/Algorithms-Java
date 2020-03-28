package test;

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
}
