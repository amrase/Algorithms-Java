package arrays;

import java.util.Arrays;

public class SingleDimensionArray {
    //Declare an array
    int arr[] = null;

    public SingleDimensionArray(int arraySize){
        arr = new int[arraySize];
        for(int i=0;i<arr.length;i++){
           arr[i] =Integer.MIN_VALUE;
        }
    }



    //Print Array
    public void traverseArray(){
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        catch (Exception e){
            System.out.println("Array no longer exists!");
        }
    }
    //Insert a value in to a specific location
    public void insert(int location,int value){
        try{
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = value;
                System.out.println("Successfully inserted " + value + " at location " + location);

            }
            else{
                System.out.println("This cell is already occupied!");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index doesn't exist!");
        }
    }


    //Access a element of an array
     public void  accessingACell(int cellNumber){
        try{
            if(arr[cellNumber] != Integer.MIN_VALUE){
                System.out.println(arr[cellNumber]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }
     }

    //Search for an element in an array
    public void  searchInAnArray(int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == value){
                System.out.println("Index of " + value + " is :" + i);
                return;
            }
            System.out.println(value + " not found!");
        }

    }

    //Delete value for given array
    public void deleteValueFromArray(int valueToDelete){
        try{
            arr[valueToDelete] = Integer.MIN_VALUE;

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("There is no element with this " + valueToDelete);
        }
    }

}
