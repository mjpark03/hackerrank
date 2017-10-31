import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
  
	  Scanner in = new Scanner(System.in);

	  int n = in.nextInt();
	  int[] weights = new int[n];

	  for (int i = 0; i < n; i++) {
	  	weights[i] = in.nextInt();
	  }

	  Arrays.sort(weights);
	  int count = 1;
	  int startWeight = weights[0];
	  int endWeight = startWeight + 4;

	  for (int w: weights) {
	  	if (!(startWeight <= w && w <= endWeight)) {
	  		startWeight = w;
	  		endWeight = startWeight + 4;
	  		count++;
	  	}
	  }

	  System.out.println(count);
  }
}
