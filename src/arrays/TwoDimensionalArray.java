package arrays;

public class TwoDimensionalArray {
    int[][] arr = null;

    public TwoDimensionalArray(int row,int col){
        arr = new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    //print 2D array
    public void print2DArray(){
        System.out.println("Printing  2D array..");
        try{

            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    System.out.println("arr["+i+"]["+j+"]=" + arr[i][j] +" ");
                }
                System.out.println();
            }

        }
        catch (Exception e){
            System.out.println("Array doesn't exist");
//            e.printStackTrace();
        }


    }


    //Insert value in array
    public void insert(int value,int row,int column){
        try {
            if(arr[row][column] == Integer.MIN_VALUE){
                arr[row][column] = value;
                System.out.println("Inserting value on index Rox# "+ row + "& Col# "+ column + " value "  + arr[row][column]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
//            e.printStackTrace();
        }

    }


    //search for a value in a 2D array
    public void searchSingleValue(int value){
            for(int i =0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    if(arr[i][j]==value){
                        System.out.println("Value " + value + " found on Row# " + i + " Column# " + j);
                        return;
                    }
                    else{
                        System.out.println("Value not found on Row# " + i + " Column# " + j );
                    }

                }
            }
    }



    //delete a value from array
    public void deleteValueFromArray(int row,int column){
        try{
            if(arr[row][column] != Integer.MIN_VALUE){
                System.out.println("Successfully changed value for " + arr[row][column]);
                arr[row][column]=Integer.MIN_VALUE;
            }

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index!");
           // e.printStackTrace();
        }
    }

}
