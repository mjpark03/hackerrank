import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  static String super_reduced_string(String s){
    int index = 0;
    int size = s.length();

    while (index < size - 1) {
      char ch = s.charAt(index);
      char nextCh = s.charAt(index + 1);

      if (ch == nextCh) {
        s = s.substring(0, index) + s.substring(index + 2, size);
        size = s.length();
        index = 0;
      } else {
        index++;
      }
    }

    if (s.length() == 0) return "Empty String";
    else return s;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    String result = super_reduced_string(s);
    System.out.println(result);
  }
}
