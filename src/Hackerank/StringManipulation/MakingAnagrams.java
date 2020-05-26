package Hackerank.StringManipulation;

import java.io.FileInputStream;
import java.util.Scanner;

public class MakingAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int result = makeAnagram(a, b);
        long endTime = System.currentTimeMillis();
        System.out.println(result);
    }

    static int makeAnagram(String a, String b) {
        int ans=0;
        int[] countA = new int[26];
        int[] countB = new int[26];
        for (int i = 0; i <a.length() ; i++) {
            char ch = a.charAt(i);
            countA[ch-'a'] +=1;
        }
        for (int i = 0; i <b.length() ; i++) {
            char ch = b.charAt(i);
            countB[ch-'a'] +=1;
        }

        for (int i = 0; i <countA.length ; i++) {
            if(countA[i]>countB[i]){
                ans += (countA[i]-countB[i]);
            }
            else if(countB[i]>countA[i]){
                ans += (countB[i]-countA[i]);
            }
        }
        return ans;
    }
}
