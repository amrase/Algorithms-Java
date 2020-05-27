package sorting;

import java.util.Arrays;

public class MarkAndToys {
    public static void main(String[] args) {
        int[] arr ={1,12,5,111,200,1000,10};
        System.out.println(maximumToys(arr,50));
    }

    static int maximumToys(int[] prices, int k) {
        int count=0,sum=0;
        for (int i = 0; i <prices.length ; i++) {
            Arrays.sort(prices);
            sum += prices[i];
            if(sum>k){
                break;
            }
            count++;
        }

        return count;
    }
}
