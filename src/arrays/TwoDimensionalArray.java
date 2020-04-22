package arrays;

public class TwoDimensionalArray {
    int array[][] = null;

    public TwoDimensionalArray(int row,int column){
        this.array = new int[row][column];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = Integer.MIN_VALUE;
                }
            }
    }

    //print 2D array
    public void print2DArray(){
        System.out.println("Printing the 2DArray....");
        try {
            for (int i=0;i<array.length;i++){
                for(int j=0;j<array.length;j++){
                    System.out.print("array["+ i+ "]["+ j+ "]=" + array[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("\n");
        }
        catch (Exception e){
            System.out.println("Array doesn't exist!");
        }
    }

    //Insert value in array
    public void insert(int value,int row,int column){
        try {
            if(array[row][column] == Integer.MIN_VALUE){
                array[row][column] = value;
                System.out.println("Successfully inserted value " + array[row][column]);
            }
            else{
                System.out.println("This cell is already occupied by another value");
            }


        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array !");
            //e.printStackTrace();
        }
    }


    //search for a value in a 2D array
    public void searchSingleValue(int value){
        System.out.println("\nSearching value " + value + " in the array..");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[i][j] == value){
                    System.out.println("Value is found at row: " + i + " ,col:" + j + "\n\n" );
                    return;
                }
            }
        }
        System.out.println("Value not found!");
    }

    //delete a value from array
    public void deleteValueFromArray(int row,int col){
        System.out.println("Deleting valut from Row#" + row + " Col#" + col + " ..." );
        try{
            System.out.println("Successfully deleted: " + array[row][col] );
            array[row][col] = Integer.MIN_VALUE;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println();
            System.out.println();
            //e.printStackTrace();
        }
    }
}
