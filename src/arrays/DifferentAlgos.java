package arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DifferentAlgos {

    public static void main(String[] args) {
      //  callBubbleSort();
 //       callSelectionSort();
//        callInsertionSort();
 //       callBucketSort();
        callFibSum(5);
    }


    public static void callBubbleSort(){
        int[] arr = {30,10,50,20,60,40};
        System.out.println("Array before sorting with bubble sort:");
        printArray(arr);
        System.out.println();
        System.out.println("Array after sorting with bubble sort");
        bubbleSort(arr);
        printArray(arr);
    }

    public static void callSelectionSort(){
        int[] arr = {30,10,50,20,60,40};
        System.out.println("Array before sorting with selection sort:");
        printArray(arr);
        System.out.println();
        System.out.println("Array after sorting with selection sort");
        selectionSort(arr);
        printArray(arr);
    }


    public static void callInsertionSort(){
        int[] arr = {30,10,50,20,60,40};
        System.out.println("Array before sorting with insertion sort:");
        printArray(arr);
        System.out.println();
        System.out.println("Array after sorting with insertion sort");
        insertionSort(arr);
        printArray(arr);
    }


    public static void callFibSum(int n){
        System.out.println("Fibonacci Sequence sum");
        System.out.println("Sum:" + fib(n));
    }


    public static void  callBucketSort(){
        float[] arr = { (float) 0.42, (float) 0.32, (float) 0.33, (float) 0.52, (float) 0.37, (float) 0.47,
                (float) 0.51 };
        System.out.println("Array before sorting");
        for(float i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        bucketSort(arr, 7);

        System.out.println("Array after sorting");
        for (float i : arr)
            System.out.print(i + "  ");
    }


    public static int sum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum ;
    }


    public static int[] m1(){
        //returning an array from methods
        return new int[]{1,2,3};
    }



    public static int[] bubbleSort(int[] array){
        int n = array.length;
        for (int i = 0; i < n-1 ; i++) {
            for (int j = 0; j < n-1 ; j++) {
                int temp  = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
        return array;
    }


    public static int[] selectionSort(int[] arr){
            int n = arr.length;
        for (int i = 0; i <n-1 ; i++) {
            int minValue = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[minValue])
                    minValue = j;

                int temp = arr[minValue];
                arr[minValue] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }


    public static int[]  insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i <n ; i++) {
            int currentNumber = arr[i],j=i-1;
            while (j>=0 && arr[j]>currentNumber){
                arr[j+1] = arr[j];
            }
            arr[j+1] = currentNumber;
        }
        return arr;
    }


    public static int fib(int n){
        int f[] = new int[n+2];
        int i ;

        f[0]=0;
        f[1]=1;

        for(i=2;i<=n;i++){
            f[i] = f[i-1] + f[n-2];

        }
        return f[n];
    }






    public static void printArray(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + ",");
        }
    }


    public static void bucketSort(float[] arr,int n){
        if (n<=0)
            return;
        ArrayList<Float>[] bucket = new ArrayList[n];

        for (int i = 0; i < n; i++)
            bucket[i] = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            int bucketIndex = (int) arr[i]*n;
            bucket[bucketIndex].add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort((bucket[i]));
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0, size = bucket[i].size(); j < size; j++) {
                arr[index++] = bucket[i].get(j);
            }
        }
    }
}

