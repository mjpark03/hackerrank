import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  static int commonChild(String s1, String s2){
    int size = s1.length();
    int[][] childCount = new int[size + 1][size + 1];

    for (int index1 = 1; index1 <= size; index1++) {
      for (int index2 = 1; index2 <= size; index2++) {
        if (s1.charAt(index1 - 1) == s2.charAt(index2 - 1)) {
          childCount[index1][index2] = childCount[index1 - 1][index2 - 1] + 1;
        } else {
          childCount[index1][index2] = Math.max(childCount[index1 - 1][index2], childCount[index1][index2 - 1]);
        }
      }
    }

    return childCount[size][size];
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s1 = in.next();
    String s2 = in.next();
    int result = commonChild(s1, s2);
    System.out.println(result);
  }
}
