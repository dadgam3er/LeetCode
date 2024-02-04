package AngryProfessor;

import java.util.ArrayList;
import java.util.List;

public class AngryProf {
  public static void main(String[] args) {

    List<Integer> a = new ArrayList<>();
    a.add(0);
    a.add(1);
    a.add(2);
    a.add(2);
    a.add(3);
    String answer = AngryProfessor(2, a);
    System.out.println(answer);
  }

  public static String AngryProfessor(int k, List<Integer> a) {

    int numOnTime = 0;
    for (int x : a) {
      if (x <= 0) {
        numOnTime++;
      }
    }
    if (numOnTime > k) {
      return "No";
    }
    return "Yes";
  }
}
