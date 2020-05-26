package Hackerank.StringManipulation;

public class AlternatingCharacters {
    public static void main(String[] args) {
        System.out.println(alternatingCharacters("ABABABAB"));
    }

    static int alternatingCharacters(String s) {
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
        return del;
    }
}
