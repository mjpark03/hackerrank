import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] calories = new int[n];
    for(int calories_i=0; calories_i < n; calories_i++){
      calories[calories_i] = in.nextInt();
    }

    Integer[] objectCalories = new Integer[calories.length];
    for (int i = 0; i<calories.length; i++) {
      objectCalories[i] = Integer.valueOf(calories[i]);
    }
    Arrays.sort(objectCalories, Collections.reverseOrder());

    int miles = 0;
    int count = 0;

    for (int calory: objectCalories) {
      miles += (calory * Math.pow(2, count));
      count++;
    }

    System.out.println(miles);
  }
}