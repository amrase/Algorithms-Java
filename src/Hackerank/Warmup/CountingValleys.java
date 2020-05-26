package Hackerank.Warmup;

public class CountingValleys {
    public static void main(String[] args) {
        System.out.println(countingValleys(9,"UDDDUDUU"));
    }

    static int countingValleys(int n, String s) {
        int count =0,altitude=0;
        for(char c : s.toCharArray()){
            if(c=='U'){
                if(altitude==-1){
                    count++;
                }
                altitude++;
            }
            else {
                altitude--;
            }
        }
        return count;
    }

}
