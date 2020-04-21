package test;

public class Algoirthms {
    public static void main(String[] args) {
        int[] testArray = {1,2,4,6,8,9,20,22};
        System.out.println("1 Biggest number = " + findBiggestNumber(testArray));
        System.out.println("2 Biggest number = " + findBiggestNumber(testArray,7));
        System.out.println("Binary Search number = " + binarySearchRecursively(testArray,8));
    }


    public static int findBiggestNumber(int[] array){
        int biggestNumber = array[0];// O(1)
        for(int i=1;i<=array.length-1;i++){ //----  O(n) - } - O(n)
            if(array[i]>biggestNumber){ //--------  O(1) - }
                biggestNumber = array[i];//--- O(1)
            }
        }
        return  biggestNumber; //------------- O(1)

        //Time Complexity = O(1)+ O(n) + O(1) = O(n)
    }

//    public static int findBiggestNumber(int[] array,int n){
//        int  highest = Integer.MIN_VALUE;
//        if( n == -1) return highest;
//        else {
//            if (array[n] > highest) {
//                highest = array[n];
//            }
//        }
//        return findBiggestNumber(array,n-1);
//
//    }

    public static  int binarySearchRecursively(int[] arr,int element)
    {    int low = 0;
         int high = arr.length-1;

         int elementPos = -1;
         while(low<=high){
             int mid = (low + high)/2;
             if(element == arr[mid]){
                 elementPos = mid;
                 break;
             }
             else if(element<arr[mid]){
                 high = mid-1;
             }
             else if(element > arr[mid]){
                 low = mid +1;
             }
         }
         return elementPos;

    }
}

