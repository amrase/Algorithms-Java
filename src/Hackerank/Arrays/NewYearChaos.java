package Hackerank.Arrays;

import java.util.Scanner;

public class NewYearChaos {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }

    static void minimumBribes(int[] q) {
        int count=0,n=q.length;
        for (int i = n-1; i >=0 ; i--) {
            int check = q[i] - (i+1);
            if(check>2){
                System.out.println("Too chaotic");
                return;
            }
            else {
                int st = Math.max(0,q[i]-2);
                for (int j = st; j <i ; j++) {
                    if(q[j]>q[i])count++;
                }
            }
        }
        System.out.println(count);
    }

}
