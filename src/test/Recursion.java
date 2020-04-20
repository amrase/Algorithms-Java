package test;

public class Recursion {
    public static void main(String[] args) {
        foo(-1);
        //System.out.println(factorial(5));
        System.out.println(fib(3));
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

    public static int fib(int n){
        if(n<1){
            return 1;
        }
        else if(n == 1 || n==2){
            return n-1;
        }
        else{
            return fib(n-1) + fib(n-2);

        }

    }
}
