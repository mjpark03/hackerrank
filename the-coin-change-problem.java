import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long getWays(int n, int[] c){
        long[] count = new long[n+1];
        count[0] = 1;

        for(int i=0; i<c.length; i++) {
            for(int j=c[i]; j<=n; j++) {
                count[j] = count[j] + count[j - c[i]];
            }
        }

        return count[n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] c = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }

        long ways = getWays(n, c);
        System.out.println(ways);
    }
}
