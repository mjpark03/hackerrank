import java.io.*;
import java.util.*;

public class ACMICPCTeam {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    String[] NM = in.nextLine().split(" ");
    int N = Integer.parseInt(NM[0]);
    int M = Integer.parseInt(NM[1]);

    byte[][] personTopics = new byte[N][M];

    for (int i = 0; i < N; i++) {
      String topics = in.nextLine();
      char[] charTopics = topics.toCharArray();

      for (int j = 0; j < M; j++) {
        personTopics[i][j] = (byte) (charTopics[j] - '0');
      }
    }

    int maxTopic = 0;
    int maxTeams = 0;
    for (int i = 0; i < N; i++) {
      byte[] first = personTopics[i];

      for (int j = i + 1; j < N; j++) {
        byte[] second = personTopics[j];

        int topic = 0;
        for (int k = 0; k < M; k++) {
          topic += first[k] | second[k];
        }

        if (maxTopic < topic) {
          maxTopic = topic;
          maxTeams = 1;
        } else if (maxTopic == topic) {
          maxTeams++;
        }
      }
    }

    System.out.println(maxTopic);
    System.out.println(maxTeams);
  }
}