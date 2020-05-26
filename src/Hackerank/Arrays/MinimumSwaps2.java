package Hackerank.Arrays;

public class MinimumSwaps2 {
    public static void main(String[] args) {
        int[] arr={4,3,1,2};
        System.out.println(minimumSwaps(arr));
    }

    static int minimumSwaps(int[] arr) {
        int count =0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==i+1)continue;
            count++;
            int temp = arr[i];
            arr[i]=arr[temp-1];
            arr[temp-1]=temp;
            i--;
        }
        return count;
    }

}
