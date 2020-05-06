package arrays;

import java.util.Arrays;

public class RotationAlgorithms {

    public static void main(String[] args) {
        leftRotate(new int[]{1,2,3,4,5,6},2);
        rightRotate(new int[]{1,2,3,4,5,6},2);
        rotateArrayKElement(new int[]{1,2,3,4,5,6},2);

        System.out.println("Rotations: "+ countRotations("4834"));

        System.out.println(isRotated("geeks","eksge"));


        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };


        transpose(arr);
        reverseColumns(arr);
        printMatrix(arr);

    }

    public static void leftRotate(int[] inputArray,int n){
        System.out.println("Array before left rotation:");
        System.out.println(Arrays.toString(inputArray));
        int temp;
        for (int i = 0; i <n ; i++) {
            temp = inputArray[0];
            for (int j = 0; j < inputArray.length-1; j++) {
                inputArray[j]  = inputArray[j+1];
            }
            inputArray[inputArray.length-1] = temp;
        }
        System.out.println("Array after left rotation:");
        System.out.println(Arrays.toString(inputArray));
    }

    public static void rightRotate(int[] array,int n){
        System.out.println("Array before right rotation:");
        System.out.println(Arrays.toString(array));
        int temp;
        for (int i = 0; i < n ; i++) {
            temp = array[array.length-1];
            for (int j = array.length-1; j >0 ; j--) {
                array[j]=array[j-1];
            }
            array[0] = temp;
        }
        System.out.println("Array after right rotation:");
        System.out.println(Arrays.toString(array));
    }

    public static void rotateArrayKElement(int[] array,int k){
        System.out.println("Array before k rotation:");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < k; i++) {
            for (int j = array.length-1; j >0 ; j--) {
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        }
        System.out.println("Array after k rotation:");
        System.out.println(Arrays.toString(array));

    }

    public static int countRotations(String n){
       int len = n.length();
       if(len==1){
           int oneDigit = (n.charAt(0)-'0');
           if(oneDigit%4==0)
               return 1;
           return 0;
       }
       int twoDigit,count=0;
        for (int i = 0; i <len-1 ; i++) {
            twoDigit = (n.charAt(i)-'0')*10 + (n.charAt(i+1)-'0');
            if(twoDigit%4==0)
                count++;

        }
        twoDigit = (n.charAt(len-1)-'0')*10 + (n.charAt(0)-'0');
        if(twoDigit%4==0)
            count++;

        return count;
    }

    public static boolean isRotated(String str1,String str2){
       if(str1.length() != str2.length())
           return false;

       String clockRot = "";
       String antiClockRot = "";
       int len = str2.length();

       antiClockRot = antiClockRot + str2.substring(len-2,len) + str2.substring(0,len-2);

       clockRot = clockRot + str2.substring(2)+ str2.substring(0,2);

       return (str1.equals(clockRot) || str1.equals(antiClockRot));

    }

    public static void reverseColumns(int[][] arr){
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0,k=arr[0].length-1; j <k ; j++,k--) {
                int temp = arr[j][i];
                arr[j][i]=arr[k][i];
                arr[k][i]=temp;
            }
        }
    }

    public static void transpose(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <arr[0].length ; j++) {
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
        }
    }

    public static void printMatrix(int[][] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j]);
            System.out.println();
        }
    }
}
