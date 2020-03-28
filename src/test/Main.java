package test;


import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] sumArray = {1,2,3};
        int[] arrayA = new int[]{17,28, 30};
        int[] arrayB = new int[]{99, 16, 8};
        BasicAlgorithms test = new BasicAlgorithms();
        System.out.println("Sum = "+ test.arraySum(sumArray));
        System.out.println("Alice " + test.compareTriplets(arrayA,arrayB) + " Bob" );
    }

}
