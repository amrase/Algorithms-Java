package arrays;

public class Main {
    public static void main(String[] args) {
       SingleDimensionArray singleArray =  new SingleDimensionArray(5);
       singleArray.traverseArray();
       System.out.println();
       singleArray.insert(0,1);
       singleArray.insert(0,2);
       singleArray.insert(1,1);
       singleArray.insert(2,3);
       singleArray.insert(3,4);
       singleArray.insert(4,5);
       singleArray.traverseArray();
       System.out.println();
       singleArray.accessingACell(1);
       singleArray.searchInAnArray(1);
       singleArray.deleteValueFromArray(1);
       singleArray.traverseArray();
    }
}
