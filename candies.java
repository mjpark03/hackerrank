import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  static long candies(int n, int[] arr) {

    int[] leftAmount = new int[n];
    int[] rightAmount = new int[n];
    leftAmount[0] = 1;
    rightAmount[n-1] = 1;


    for (int i=1; i<n; i++) {
      if (arr[i] > arr[i-1])
        leftAmount[i] = leftAmount[i-1] + 1;
      else
        leftAmount[i] = 1;
    }

    for (int i=n-2; i>=0; i--) {
      if (arr[i] > arr[i+1])
        rightAmount[i] = rightAmount[i+1] + 1;
      else
        rightAmount[i] = 1;
    }

    long sum = 0;
    for (int j=0; j<n; j++)
      sum += Math.max(leftAmount[j], rightAmount[j]);

    return sum;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];

    for(int arr_i = 0; arr_i < n; arr_i++){
      arr[arr_i] = in.nextInt();
    }

    long result = candies(n, arr);
    System.out.println(result);
    in.close();
  }
}