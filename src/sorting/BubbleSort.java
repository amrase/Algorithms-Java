package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={3,2,1};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] a){
        int swaps = 0;

        for(int j = 0; j < a.length - 1; j++) {
            for(int i = 0; i < a.length - 1; i++) {
                if(a[i] > a[i+1]) {

                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;

                    swaps++;
                }
            }
        }

        System.out.println("Array is sorted in "+swaps);
        System.out.println("First element: "+ a[0]);
        System.out.println("Last element: " +a[a.length-1]);
    }



    static void swap(int a, int b){
            int temp = a;
            a=b;
            b=temp;
    }

    static void print(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}



