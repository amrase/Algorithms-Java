package Hackerank.Arrays;

import java.util.Scanner;

public class Array2DDS {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int rowSize = 6;
        int colSize = 6;
        System.out.println("Enter matrix values:");
        int[][] array = new int[rowSize][colSize];
        for(int row = 0; row < rowSize; row++) {
            for(int col = 0; col < colSize; col++) {
                array[row][col] = read.nextInt();
            }
        }
        read.close();

        System.out.println("Max Sum="+ hourglassSum(array));
    }


    static int hourglassSum(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = calculateHourglassSum(arr,i,j);
                if(sum>max){
                    max = sum;
                }
            }
        }
        return max;
    }

    static int calculateHourglassSum(int[][] arr,int rowIndex,int colIndex){
        int sum=0;
        for (int i = rowIndex; i < rowIndex+3; i++) {
            for (int j = colIndex; j <colIndex+3 ; j++) {
                if(i==rowIndex+1 && j!=colIndex+1){
                    continue;
                }
                sum += arr[i][j];
            }
        }
        return sum;
    }



}
