package arrays;

public class Example {
    public static void main(String[] args) {
        int[] array = {12,56,76,89,100,343,21,234};
        System.out.println(missingElement(array));
        System.out.println(searchElementInArray(array,5));
        System.out.println(searchSecondHighestNumber(array));

        int array2[] = new int[]{20, 40, 20, 40, 20, 30, 30, 50, 20, 40, 40, 20};
        System.out.println("Number which occurs odd number of times is : "+ getOddTimesElement(array2));

        smallestAndLargestNumber(array);
        findPairWithMinSum(array);
    }

    public static int missingElement(int[] array){
        int n = array.length + 1;
        int sum = n*(n+1)/2;
        int restSum = 0;
        for (int i = 0; i <array.length ; i++) {
            restSum += array[i];
        }
        int middNum = sum - restSum;
        return middNum;
    }

    public static int searchElementInArray(int[] array,int target){
        int left = 0;
        int right = array.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(target == array[mid]){
                return mid;
            }
            if(array[left]<= array[mid]){
                if(array[left]<=target && target<array[mid]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else{
                if(array[mid]<target && target<=array[right]){
                    left = mid+1;
                }
                else {
                    right = mid -1;
                }
            }
        }
        return -1;
    }

    public static int searchSecondHighestNumber(int[] array){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>first){
                second = first;
                first = array[i];
            }
            else if (array[i]>second && first!= array[i]){
                second = array[i];
            }
        }
        return second;
    }

    public static int getOddTimesElement(int ar[])
    {
        int i;
        int result = 0;
        for (i = 0; i<ar.length ; i++) {
            result = result ^ ar[i];
        }
        return result;
    }

    public static void smallestAndLargestNumber(int[] array){
        int smallest = array[0];
        int largest = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i] > largest){
                largest =array[i];
            }
            else if(array[i]<smallest){
                smallest = array[i];
            }
        }
        System.out.println("Smallest number is " + smallest);
        System.out.println("Largest number is " + largest);

    }

    public static void findPairWithMinSum(int arr[]){
        if(arr.length<2){
            return;
        }
        int minimumSum = arr[0] + arr[1];
        int pars1Index = 0;
        int pars2Index = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int tempSum = arr[i] + arr[j];
                if(Math.abs(tempSum) < Math.abs(minimumSum)){
                    pars1Index=i;
                    pars2Index=j;
                    minimumSum = tempSum;
                }
            }
        }
        System.out.println("The pair whose sum is closest to zero: " + arr[pars1Index] + " ," + arr[pars2Index]);
    }

}
