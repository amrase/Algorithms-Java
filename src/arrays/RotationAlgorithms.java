package arrays;

import java.util.Arrays;

public class RotationAlgorithms {

    public static void main(String[] args) {
        leftRotate(new int[]{1,2,3,4,5,6},2);
        rightRotate(new int[]{1,2,3,4,5,6},2);
        rotateArrayKElement(new int[]{1,2,3,4,5,6},2);


    }

    public static void leftRotate(int[] inputArray,int n){
        System.out.println("Input Array Before Rotation :");
        System.out.println(Arrays.toString(inputArray));
        int temp;
        for (int i = 0; i <n ; i++) {
            temp = inputArray[0];
            for (int j = 0; j <inputArray.length-1 ; j++) {
                inputArray[j] = inputArray[j+1];
            }
            inputArray[inputArray.length-1] = temp;
        }

        System.out.println("Array after left rotation");
        System.out.println(Arrays.toString(inputArray));
    }

    public static void rightRotate(int[] array,int n){
        System.out.println("Array before rotation:");
        System.out.println(Arrays.toString(array));
        int temp;
        for (int i = 0; i <n ; i++) {
            temp  = array[array.length-1];
            for (int j = array.length-1; j >0 ; j--) {
                array[j] = array[j-1];
            }
            array[0] = temp;
        }

        System.out.println("Array after right rotation:");
        System.out.println(Arrays.toString(array));
    }


    public static void rotateArrayKElement(int[] array,int k){
        System.out.println("Array before rotation k element:");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i <k ; i++) {
            for (int j = array.length-1; j >0; j--) {
                int temp  =array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
            System.out.println("Array rotated on index " + (i+1) + "step");
            System.out.println(Arrays.toString(array));
        }
    }


}
