package Hackerank.Warmup;

public class JumpingOnClouds {
    public static void main(String[] args) {
        int[] clouds = {0,0,1,0,0,1,0};
        System.out.println(jumpingOnClouds(clouds));
    }

    static int jumpingOnClouds(int[] c) {
       int count=-1,n=c.length;
        for (int i = 0; i <n ; i++,count++) {
            if(i<n-2 && c[i+2]==0){
                i++;
            }
        }
        return count;
    }
}
