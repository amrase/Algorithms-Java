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


    public static int diagonalDifference(List<List<Integer>> matrix){
        int leftSum = 0,rightSum = 0;
        int topRight = matrix.size()-1;

        for(int i =0;i<matrix.size();i++){
            leftSum += matrix.get(i).get(i);
            rightSum += matrix.get(i).get(topRight-i);
        }


        return  Math.abs(leftSum-rightSum);
    }
}
