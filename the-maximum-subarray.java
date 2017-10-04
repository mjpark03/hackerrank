import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  public static void main(String args[] ) throws Exception {
    Scanner in = new Scanner(System.in);
    int t = Integer.parseInt(in.nextLine());

    for (int i=0; i<t; i++) {
      int n = Integer.parseInt(in.nextLine());
      int[] nums = new int[n];

      StringTokenizer st = new StringTokenizer(in.nextLine());
      int index = 0;
      while( st.hasMoreTokens() ) {
        nums[index++] = Integer.parseInt(st.nextToken());
      }

      int conMax = nums[0];
      int unconMax = nums[0];
      int sum = nums[0];
      boolean positiveExist = false;

      for (int j=1; j<n; j++) {
        sum = Math.max(nums[j], sum + nums[j]);
        if (conMax < sum) conMax = sum;

        if (!positiveExist && nums[j] > 0) {
          if (unconMax < 0) unconMax = 0;
          positiveExist = true;
        }
        if (!positiveExist) unconMax = Math.max(unconMax, nums[j]);
        if (positiveExist && nums[j] > 0) unconMax += nums[j];
      }

      System.out.println(conMax + " " + unconMax);
    }
  }
}