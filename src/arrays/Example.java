package arrays;

public class Example {
    public static void main(String[] args) {
        int[] array = {1,2,3,5};
        System.out.println(missingElement(array));
        System.out.println(searchElementInArray(array,5));
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
}
