import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  static BigInteger[] fibo = new BigInteger[21];

  public static void main(String args[] ) throws Exception {
    Scanner in = new Scanner(System.in);
    String[] input = in.nextLine().split(" ");

    fibo[1] = new BigInteger(input[0]);
    fibo[2] = new BigInteger(input[1]);
    BigInteger result = fibonacci(Integer.parseInt(input[2]));

    System.out.println(result);
  }

  static BigInteger fibonacci(int n) {

    if (n <= 2 || fibo[n] != null) return fibo[n];

    fibo[n] = fibonacci(n-2).add((fibonacci(n-1).multiply(fibonacci(n-1))));
    return fibo[n];
  }

}
