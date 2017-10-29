import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  static int sherlockAndAnagrams(String s){
    int length = s.length();
    int count = 0;

    for (int size = 1; size < length; size++) {
      for (int index = 0; index <= length - size; index++) {
        String sub1 = s.substring(index, index + size);

        for (int subIndex = index + 1; subIndex <= length - size; subIndex++) {
          String sub2 = s.substring(subIndex, subIndex + size);

          if (checkUnorderedAnagrams(sub1, sub2))
            count++;
        }
      }
    }

    return count;
  }

  static boolean checkUnorderedAnagrams(String sub1, String sub2) {
    char sub1Count[] = new char[27];
    char sub2Count[] = new char[27];

    for (char ch: sub1.toCharArray()) {
      sub1Count[ch - 96]++;
    }

    for (char ch: sub2.toCharArray()) {
      sub2Count[ch - 96]++;
    }

    for (int i = 0; i < 27; i++) {
      if (sub1Count[i] != sub2Count[i]) return false;
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int q = in.nextInt();
    for(int a0 = 0; a0 < q; a0++){
      String s = in.next();
      int result = sherlockAndAnagrams(s);
      System.out.println(result);
    }
  }
}
