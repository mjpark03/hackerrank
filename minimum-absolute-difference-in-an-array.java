import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        Arrays.sort(a);
        int min = -1;

        for(int i=1; i<n; i++) {

            int diff = Math.abs(a[i-1] - a[i]);
            if(min == -1 || min > diff)
                min = diff;
        }

        System.out.println(min);
    }
}
