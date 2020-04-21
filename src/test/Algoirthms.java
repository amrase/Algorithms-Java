package test;

public class Algoirthms {
    public static void main(String[] args) {
        int[] testArray = {2,1,4,6,8,9,30,22};
        System.out.println("1 Biggest number = " + findBiggestNumber(testArray));
        //System.out.println("2 Biggest number = " + findBiggestNumber(testArray,7));
        System.out.println("Binary Search number = " + binarySearchRec(testArray,8,0,testArray.length-1));
        System.out.println("Min number = " + findMinRec(testArray,testArray.length));
        System.out.println("Big number = " + findBigRec(testArray,testArray.length));
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

    public static int findBiggestNum(int[] array){
        int biggestNumber = array[0];
        for(int i = 0;i<array.length-1;i++){
            if(array[i] > biggestNumber){
                biggestNumber = array[i];
            }
        }
        return biggestNumber;
    }

    private static int binarySearchRec(int[] array,int element,int low,int high){
       if(low > high) return -1;
       //Default assumption that the element is not found
       int elementPos = -1;
       int mid = (low+high)/2;
       if(element == array[mid]){
           elementPos = mid;
       }
       else if(element<array[mid]){
           return binarySearchRec(array,element,low,mid-1);
       }
       else if(element>array[mid]){
           return binarySearchRec(array,element,mid+1,high);
       }
       return elementPos;
    }

    public static int findMinRec(int[] array,int n){
        if(n==1){
            return array[0];
        }
        return Math.min(array[n-1],findMinRec(array,n-1));
    }

    public static int findBigRec(int[] array,int n){
        if(n==1) return array[0];
        return Math.max(array[n-1],findBigRec(array,n-1));
    }



    public static int binarySearchIterative(int[] arr,int element)
    {   int low = 0;
        int high = arr.length -1;
        int elementPos = -1;
        while(low<=high){
            int mid = (low + high)/2;
            if(element == arr[mid]){
                elementPos = mid;
                break;
            }
            else if(element < arr[mid]){
                high = mid-1;
            }
            else if(element>arr[mid]){
                low = mid+1;
            }
        }
        return elementPos;
    }
}

