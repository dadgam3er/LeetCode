
import java.util.ArrayList;
import java.util.List;

public class ArraySum {
  public static void main(String[] args) {

    List<Integer> ar = new ArrayList<>();
    ar.add(3);
    ar.add(3);
    ar.add(3);
    ar.add(3);
    ar.add(3);
    ar.add(3);
    ar.add(3);
    ar.add(3);
    ar.add(3);
    ar.add(3);

    System.out.println(sumArray(ar));
  }

  private static int sumArray(List<Integer> arr) {
    int sum = 0;
    for (int x : arr) {
      sum += x;
    }
    return sum;
  }
}
