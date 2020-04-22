package arrays;

import java.util.Arrays;

public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i=0;i<arr.length;i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    //Print Array
    public void traverseArray(){
        try {
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }

        }
        catch (Exception e){
            System.out.println("Array no longer exists");
        }
    }

    public void insert(int location,int valueToBoInserted){
        try{
            if(arr[location] == Integer.MIN_VALUE){
                arr[location]= valueToBoInserted;
                System.out.println("Successfully inserted " + valueToBoInserted + " at location " + location);
            }
            else{
                System.out.println("This cell is already occupied");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array!");
        }
    }

    //Access a element of an array
    public void accessingACell(int cellNumber){
        try{
            System.out.println(arr[cellNumber]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access!");
        }
    }

    //Search for an element in an array
    public void searchInAnArray(int valueToSearch){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == valueToSearch){
                System.out.println("Value to find!");
                System.out.println("Inex of " + valueToSearch + " is :" + i );
                return;
            }
        }
        System.out.println(valueToSearch + " is not found");
    }

    //Delete value for given array
    public void deleteValueFromArray(int deleteValueFromThisCell){
        try{
            arr[deleteValueFromThisCell] = Integer.MIN_VALUE;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Cant delete the value as cell provided ,it's not in the range of array!");
        }
    }
}
