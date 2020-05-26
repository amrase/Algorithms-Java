package Hackerank.StringManipulation;

public class SherlockAndTheValidString {
    public static void main(String[] args) {

    }

    static String isValid(String s) {
        int del=0;
        char c= s.charAt(0);
        for (int i = 0; i <s.length() ; i++) {
            if(c == s.charAt(i)){
                del++;
            }
            else{
                c = s.charAt(i);
            }
        }
        return "YES";
    }


}
