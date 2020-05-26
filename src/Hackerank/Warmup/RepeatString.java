package Hackerank.Warmup;

public class RepeatString {
    public static void main(String[] args) {
        System.out.println(repeatedString("ceebbcb",817723));
    }

    static int numberOfAs(String s,long len){
        int countA = 0;
        for (int i = 0; i <len ; i++) {
            if(s.charAt(i)=='a'){
                countA++;
            }
        }
        return countA;

    }

    static long repeatedString(String s, long n) {
        int size= s.length();
        int numA = numberOfAs(s,size);
        double val = Math.floor(n/size);
        if(size%n==0){
            return numA*(long)val;
        }
        else{
            long countA = (long)val * numA;
            long valsLeft = n -(long)(val*size);
            long leftA = numberOfAs(s,valsLeft);
            long ans = countA  + leftA;
            return ans;
        }
    }
}
