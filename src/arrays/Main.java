package arrays;

public class Main {
    public static void main(String[] args) {
       SingleDimensionArray singleArray =  new SingleDimensionArray(5);
       TwoDimensionalArray tda = new TwoDimensionalArray(5,5);
       tda.print2DArray();
       System.out.println();
       tda.insert(4,0,0);
       tda.insert(1,1,0);
       tda.insert(5,2,0);
       tda.insert(1,3,0);
       tda.insert(8,4,0);
       tda.insert(9,0,1);
       tda.insert(53,1,1);
       tda.insert(1,2,1);
       tda.insert(2,3,1);
       tda.insert(54,4,1);

       tda.print2DArray();

       tda.searchSingleValue(4);
       tda.searchSingleValue(1);
       tda.searchSingleValue(5);
       tda.deleteValueFromArray(0,0);
       tda.print2DArray();

//       singleArray.traverseArray();
//       System.out.println();
//       singleArray.insert(0,1);
//        singleArray.insert(0,2);
//        singleArray.insert(1,1);
//        singleArray.insert(2,3);
//        singleArray.insert(3,4);
//        singleArray.insert(4,5);
//        singleArray.traverseArray();
//        System.out.println();
//        singleArray.accessingACell(1);
//        singleArray.searchInAnArray(1);
//        singleArray.deleteValueFromArray(1);
//        singleArray.traverseArray();
    }
}
