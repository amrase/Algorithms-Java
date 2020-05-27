package JavaPractise.Algos;

import java.util.List;

public class Practise1 {
    public static void main(String[] args) {
        //callAVeryBigSum();
        callDifferenceDiagonalInt();


    }

    public static void callDifferenceDiagonalInt(){
        int[][] arr = {{11,2, 4},{4,5,6},{10,8,-12}};
        System.out.println(diagonalDifferenceInt(arr));
    }

    public static void callAVeryBigSum(){
        long[] arr = {1000000001,1000000002,1000000003,1000000004,1000000005};
        printArray(arr);
        System.out.println();
        System.out.println("Sum" + aVeryBigSum(arr));
    }

    static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for (int i = 0; i <ar.length ; i++) {
            sum +=ar[i];
        }
        return sum;
    }

    static void printArray(long[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int row = 0;
        int column = arr.get(0).size()-1;
        int sum=0;
        for (int i = 0; i <arr.size() ; i++) {
            sum -= arr.get(row).get(row) - arr.get(row++).get(column--);
        }
        return Math.abs(sum);
    }

    public static int diagonalDifferenceInt(int[][] arr){
        int d1 = 0,d2=0,n=arr.length;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(i==j){
                    d1 += arr[i][j];
                }
                if(i==n-j-1){
                    d2 += arr[i][j];
                }
            }
        }
        return Math.abs(d1-d2);
    }
}
