package LogicalDS;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();
        st.push("Welcome");
        st.push("to");
        st.push("my");
        st.push("first");
        st.push("mobile");

        System.out.println("Stack" + st);
        st.push("app");
        System.out.println("Final stack" + st);
        st.pop();
        System.out.println("After first pop stack:" + st);// removes app
        st.pop();
        System.out.println("After second pop stack:" + st);// removes mobile

        System.out.println("Peek stack:" + st.peek());// first
        System.out.println("If it's empty " + st.isEmpty());//Boolean value




    }
}
