package arrays;

public class DifferentAlgos {

    public static void main(String[] args) {
      //  callBubbleSort();
//        callSelectionSort();
        callInsertionSort();
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
        for (int i = 0; i < n-1; i++) {
            int minValue = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[minValue])
                    minValue = j;

                int temp = arr[minValue];
                arr[minValue] = arr[i];
                arr[i]  = temp;
            }
        }
        return arr;
    }


    public static int[]  insertionSort(int[] arr){
       int n = arr.length;
        for (int i = 1; i <n-1 ; ++i) {
            int currentNumber = arr[i],j=i-1;
            while (j>=0 && arr[j]>currentNumber){
                arr[j+1] = arr[j];
            }
            arr[j+1] = currentNumber;
        }
        return arr;
    }





    public static void printArray(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + ",");
        }
    }

}
