package arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] array  = new int[5];
        array[0]=0;array[1]=20;array[2]=11;array[3]=0;

        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
            System.out.print(",");
        }

        System.out.println();
        //insertValueIntoArray(array,220,4);
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
            System.out.print(",");
        }

        System.out.println("Element in a specific cell : " + accessingCell(array,1));
        //System.out.println("Element in a specific cell : " + accessingCell(array,5));
        searchValueInArray(array,0);
        deletingValue(array,3);
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
            System.out.print(",");
        }


    }

    public static int insertValueIntoArray(int[] array,int value,int location){ //-- O(1)
        //Time Complexity - O(1)
        //Space Complexity - O(1)
        if(array[location] != 0){//-- O(1)
            System.out.println("Location occupied");//-- O(1)
        }
        return  array[location] = value;//-- O(1)
    }

    public static int accessingCell(int[] arr,int cellNumber) throws  ArrayIndexOutOfBoundsException{
        //Time Complexity - O(1)
        //Space Complexity - O(1)
        if(cellNumber > arr.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        return arr[cellNumber];
    }

    public static void searchValueInArray(int[] array, int value){
        //Time Complexity - O(n)
        //Space Complexity - O(1)
        for(int i=0;i<array.length;i++){
            if(array[i] == value){
                System.out.println(i);
            }
            else {
                System.out.println("Value not found");
            }
        }

    }

    public static void deletingValue(int[] array,int location){
        if(array[location] != 0){
            array[location] = Integer.MIN_VALUE;
        }
        else{
            System.out.println("Location already blank");
        }
    }

}
