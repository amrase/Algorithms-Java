package arrays;

public class Example2 {
    public static void main(String[] args) {
        //declares an Array integer
        int[] arr;
        // allocating memory for 5 integers
        arr = new int[5];
        //initialize the first element
        arr[0]=10;
        //initialize the second element

        //and so on..
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        //  accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " : "+ arr[i]);
        }


        //Declaring an array of objects
        Student[] student;
        //allocating memory for 5 objects;
        student = new Student[5];
        //initializing the first element the array
        student[0] = new Student(1,"aman");
        student[1] = new Student(2,"ena");
        student[2] = new Student(3,"ado");
        student[3] = new Student(4,"dea");
        student[4] = new Student(5,"genta");


        for (int i = 0; i <student.length ; i++) {
            System.out.println("Student at places : "+ student[i].getRoll_one() + " name is : "
                    + student[i].getName()
            );
        }

        //declaring and initializing a 2D array
        int[][] array2D = {{2,7,9,},{1,2,4},{4,5,4}};
        for (int i = 0; i < array2D.length ; i++) {
            for (int j = 0; j<array2D.length ; j++) {
                System.out.print( "A["+i +"][" + j+"]="+array2D[i][j]+ " ");

            }
            System.out.println();
        }

        DifferentAlgos da = new DifferentAlgos();
        System.out.println("Sum of array is :" + da.sum(arr));

        int[] arr2 = da.m1();
        for (int i = 0; i < arr2.length ; i++) {
            System.out.print(arr2[i] + " ");
        }


        int intArray[] = new int[3];
        byte byteArray[] = new byte[3];
        short shortArray[] = new short[3];
        String strArray[] = new String[3];


        System.out.println(intArray.getClass());
        System.out.println(intArray.getClass().getSuperclass());
        System.out.println(byteArray.getClass());
        System.out.println(byteArray.getClass().getSuperclass());
        System.out.println(shortArray.getClass());
        System.out.println(strArray.getClass());

        int intArrayC[] = {1, 2, 3};
        int cloneArray[] = intArrayC.clone();
        System.out.println( intArrayC == cloneArray);
        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print("Clone Array");
            //?
            System.out.print(cloneArray[i] + " ");
            System.out.println();
        }

        int arrJ[][] = new int[4][];
        arrJ[0] = new int[1];
        arrJ[1] = new int[2];
        arrJ[2] = new int[3];
        arrJ[3] = new int[4];

        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                arrJ[i][j] = k;
                k++;
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(" " + arrJ[i][j]);
                k++;
            }
            System.out.println();
        }
    }
}

