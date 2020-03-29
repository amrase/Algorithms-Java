package test;

import java.util.List;
import java.util.Arrays;

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


    public static int diagonalDifference(List<List<Integer>> arr){
        int leftSum=0,rightSum=0;

        int topRight = arr.size() -1;
        for(int i=0;i<arr.size();i++){
            leftSum += arr.get(i).get(i);
            rightSum += arr.get(i).get(topRight-i);
        }
        return  Math.abs(leftSum-rightSum);
    }

    public static void plusMinus(int[] arr){
//        Given an array of integers, calculate the
//        fractions of its elements that are positive,
//        negative, and are zeros. Print the decimal value
//        of each fraction on a new line.
          int positiveNum=0,negativeNum=0,zeroNum=0;
          double positiveFrac=0,negativeFrac=0,zeroFrac=0;
          for(int i=0;i< arr.length;i++){
              if(arr[i]>0){
                  positiveNum++;
              }
              else if(arr[i]<0){
                  negativeNum++;
              }
              else{
                  zeroNum++;
              }
          }
          positiveFrac = (double)positiveNum/arr.length;
          System.out.format("%.6f",positiveFrac);
          System.out.println();
          negativeFrac = (double)negativeNum/arr.length;
          System.out.format("%.6f",negativeFrac);
          System.out.println();
          zeroFrac = (double)zeroNum/arr.length;
          System.out.format("%.6f",zeroFrac);
    }

    public static void staircase(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i+j)>n){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }


    public static void miniMaxSum(int[] arr){
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }

            }
        }
        long minSum = 0,maxSum=0;
        for(int i=1;i<arr.length;i++){
            maxSum += arr[i];
        }
        for(int i=0;i<arr.length-1l;i++){
            minSum +=arr[i];
        }
        System.out.println(minSum + " " + maxSum);
    }









//    public static void miniMaxSum(int[] arr) {
//        int temp = 0;
//        for (int i = 0; i < arr.length; i++)
//        {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j])
//                {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//
//        long minSum = 0;
//        long maxSum = 0;
//        for(int i = 1; i< arr.length; i++){
//            maxSum = maxSum + arr[i];
//        }
//        for(int i = 0; i< arr.length-1; i++){
//            minSum = minSum + arr[i];
//        }
//        System.out.println(minSum+ " " +maxSum);
//    }

    public static void swapArray(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j=1; j < (arr.length-i); j++) {
                if(arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


}
