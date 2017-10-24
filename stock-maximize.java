import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static long maxProfit(int n, int[] stocks) {
    int max = 0;
    long profit = 0;

    for (int i = n-1; i >= 0; i--) {
      max = Math.max(max, stocks[i]);
      profit += (max - stocks[i]);
    }

    return profit;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
      int n = in.nextInt();
      int[] arr = new int[n];
      for(int arr_i = 0; arr_i < n; arr_i++){
        arr[arr_i] = in.nextInt();
      }

      long profit = maxProfit(n, arr);
      System.out.println(profit);
    }

    in.close();
  }
}
