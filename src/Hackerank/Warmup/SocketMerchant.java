package Hackerank.Warmup;

import java.util.ArrayList;
import java.util.Arrays;

public class SocketMerchant {
    public static void main(String[] args) {
        int[] arr = {10,20,20,10,10,30,50,10,20};
        printArray(arr);
        System.out.println("\nCount:"+socketMerchant(arr.length,arr));
    }

    public static int socketMerchant(int n,int[] ar){
        Arrays.sort(ar);
        int count =0;
        for (int i = 0; i <ar.length-1 ; i++) {
            if(ar[i]==ar[i+1]){
                count++;
                i++;
            }
        }
        return count;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
