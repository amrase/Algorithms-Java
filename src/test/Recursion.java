package test;

public class Recursion {
    public static void main(String[] args) {
        foo(3);
        System.out.println(factorial(4));
    }

    public static void foo(int n){
        if(n<1){
            return;
        }
        else{
            foo(n-1);
            System.out.println("Hello " + n);
        }
    }

    public static int factorial(int n){
        if (n < 0) {
            return -1;
        }
        else if(n==0){
           return 1;
        }
        else{
           return (n*factorial(n-1));
        }
    }
}
