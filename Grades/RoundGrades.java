package Grades;

import java.util.ArrayList;
import java.util.List;

public class RoundGrades {
  public static void main(String[] args) {

    List<Integer> notes = new ArrayList<>();

    notes.add(34);
    notes.add(39);
    notes.add(54);
    notes.add(99);
    notes.add(29);
    notes.add(88);
    System.out.println(studentsGrades(notes));

  }

  public static List<Integer> studentsGrades(List<Integer> grades) {

    List<Integer> results = new ArrayList<>();
    for (int grade : grades) {
      if (grade < 38) {
        results.add(grade);
      } else {
        int remainder = grade % 5;
        int roundNum = grade + 5 - remainder;
        results.add(roundNum - grade < 3 ? roundNum : grade);
      }
    }
    return results;
  }
}
