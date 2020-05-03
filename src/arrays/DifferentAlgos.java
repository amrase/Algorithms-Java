package arrays;

public class DifferentAlgos {

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


}
