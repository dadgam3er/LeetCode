
import java.util.ArrayList;
import java.util.List;

public class BirdsMigration {
  public static void main(String[] args) {

    List<Integer> BirdType = new ArrayList<>();
    BirdType.add(1);
    BirdType.add(3);
    BirdType.add(3);
    BirdType.add(2);
    BirdType.add(2);
    BirdType.add(2);

    System.out.println(smallestID(BirdType));

  }

  private static int smallestID(List<Integer> birds) {
    int[] birdsTypeId = new int[6];
    int max = 0;

    for (int bird : birds) {
      birdsTypeId[bird]++;
      max = Math.max(max, birdsTypeId[bird]);
    }
    for (int i = 0; i < birdsTypeId.length; i++) {
      if (birdsTypeId[i] == max) {
        return i;
      }
    }
    return 0;
  }
}
