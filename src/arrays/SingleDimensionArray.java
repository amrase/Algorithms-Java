package arrays;

public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i=0;i<arr.length;i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }
}
