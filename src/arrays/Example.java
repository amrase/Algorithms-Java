package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
//        int[] array = {12,56,76,89,100,343,21,234};
//        System.out.println(missingElement(array));
//        System.out.println(searchElementInArray(array,5));
//        System.out.println(searchSecondHighestNumber(array));
//
//        int array2[] = new int[]{20, 40, 20, 40, 20, 30, 30, 50, 20, 40, 40, 20};
//        System.out.println("Number which occurs odd number of times is : "+ getOddTimesElement(array2));
//
//        smallestAndLargestNumber(array);
//        findPairWithMinSum(array);
//
//
//        int arrayDiff[]={-40,-5,1,3,6,7,8,20};
//        findSumOfPairNearestToXElement(arrayDiff,3);
//        findPairsEqualsToX(arrayDiff,15);


//        int arr0s1s[] = {0,1,0,0,1,1,1,0,1};
//        System.out.println("Original Array: ");
//        for (int i = 0; i < arr0s1s.length; i++) {
//            System.out.print(arr0s1s[i]+" ");
//        }
//        arr0s1s=separate0s1s(arr0s1s);
//        System.out.println("\n===========================");
//        System.out.println("\nArray after separating 0's and 1's : ");
//        for (int i = 0; i < arr0s1s.length; i++) {
//            System.out.print(arr0s1s[i]+" ");
//        }

//
//        int arr0s1s2s[] = {1,2,2,0,0,1,2,2,1};
//        System.out.println("Original Array: ");
//        for (int i = 0; i < arr0s1s2s.length; i++) {
//            System.out.print(arr0s1s2s[i]+" ");
//        }
//        arr0s1s2s=separate0s1s2s(arr0s1s2s);
//        System.out.println("\n===========================");
//        System.out.println("\nArray after separating 0's and 1's : ");
//        for (int i = 0; i < arr0s1s2s.length; i++) {
//            System.out.print(arr0s1s2s[i]+" ");
//        }

//        int[] arr = {2,3,6,4,9,0,11,9};
//        subarraysWithGivenSum(arr,9);

//         int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
//         isLeaderInArray(arr);

//        int[] arr = {0,0,0,1,1,1,1};
//        System.out.println(count1inArray(arr));

//        int arr[]= {47, 43, 45, 44, 46};


//        if(checkArrayContainsConsecutiveElements(arr,arr.length))
//            System.out.println(" Array elements are consecutive ");
//        else
//            System.out.println(" Array elements are not consecutive ");
//        return;

//        int[] arr1 = {1,2,3,4,5,6};
//
//        rotateBykElement(arr1,6);
        int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
        System.out.println("Maximum profit :"+stockByCellByProfit(arr));


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

    public static int getOddTimesElement(int ar[]) {
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

    public static void findSumOfPairNearestToXElement(int[] array,int x) {
        if (array.length < 2) {
            return;
        }
        int minimumDiff = (array[0] + array[1] - x);
        int element1PairIndex = 0;
        int element2PairIndex = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int tempDiff = array[i] + array[j] - x;
                if (Math.abs(tempDiff) < Math.abs(minimumDiff)) {
                    element1PairIndex = i;
                    element2PairIndex = j;
                    minimumDiff = tempDiff;

                }
            }

        }

        System.out.println(" The pair whose sum is closest to X using brute force method: " + array[element1PairIndex] + " ," + array[element2PairIndex]);
    }

    public static void findPairsEqualsToX(int[] arr,int x){
        if(arr.length<2){
            return;
        }
        Arrays.sort(arr);
        System.out.println("The pair sum whose sum is equals to X: " + x);
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            int currentSum = arr[l] + arr[r];
            if(currentSum == x){
                System.out.println(arr[l] + " " + arr[r]);
                l++;
                r--;
            }
            else if(arr[l]+ arr[r]<x){
                l++;
            }
            else {
                r--;
            }
        }
    }

    public static int[] separate0s1s(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            arr[i]=0;
        }
        for (int i = count; i <arr.length ; i++) {
            arr[i]=1;
        }
        return arr;
    }

    public static int[] separate0s1s2s(int[] arr){
        int c0=0;
        int c1=0;
        int c2=0;
        int i;
        for(i=0;i<arr.length;i++) {
            switch (arr[i]) {
                case 0:
                    c0++;
                    break;
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
            }
        }
            i=0;
            while (c0>0){
                arr[i++]=0;
                c0--;
            } while (c1>0){
                arr[i++]=1;
                c1--;
            } while (c2>0){
                arr[i++]=2;
                c2--;
            }

        return arr;
    }

    public static void subarraysWithGivenSum(int[] arr,int num){
        for (int i = 0; i <arr.length ; i++) {
            int currSum = 0;
            for (int j = i; j <arr.length ; j++) {
                currSum += arr[j];
                if(currSum == num){
                    System.out.println("Starting index: " + i +
                            ", ending index: " + j
                    );
                }
            }
        }
    }

    public static void isLeaderInArray(int[] arr){
        System.out.println("Finding leaders in an array:");
        for (int i = 0; i < arr.length; i++) {
            boolean isLeader  = true;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<=arr[j]){
                    isLeader = false;
                     break;
                }
            }
            if(isLeader){
                System.out.println(arr[i]+ "");

            }
        }
    }

    public static int  count1inArray(int[] array){
        int count1s = 0;
        while(count1s <array.length){
            if(array[count1s] ==1){
                break;
            }
            count1s++;
        }
        return array.length-count1s;
    }

    private static int findMin(int[] arr, int n){
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if( arr[i] <min){
                min = arr[i];
            }
        }
        return min;
    }

    private static int findMax(int[] arr, int n){
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static boolean checkArrayContainsConsecutiveElements(int[] arr,int n){
        if(n<1){
            return false;
        }
        int min = findMin(arr,n);
        int max = findMax(arr,n);
        if( max-min+1 == n){
            boolean[] checked = new boolean[arr.length];
            for (int i = 0; i <n ; i++) {
                if(checked[arr[i]-min]!= false){
                    return false;
                }
                checked[arr[i]-min] = true;
            }
            return true;
        }
        return false;
    }

    public static int[] rotateBykElement(int[] arr,int k){
        for (int i = 0; i < k; i++) {
            for (int j = arr.length-1; j>0; j--) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
            System.out.println("Array rotate after " + (i+1)+ " step");
            printArray(arr);
            System.out.println();
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static int stockByCellByProfit(int[] stock){
        int lowestPrice = stock[0];
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i <stock.length ; i++) {
            int profit =0;
            if(stock[i]>lowestPrice){
                profit = stock[i] - lowestPrice;
                if(profit > maxProfit){
                    maxProfit = profit;
                }
                else {
                    lowestPrice = stock[i];
                }
            }
        }
        return maxProfit;
    }
}
