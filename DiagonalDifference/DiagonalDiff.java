import java.util.List;

public class DiagonalDiff {
  public static void main(String[] args) {
    List<List<Integer>> matrix = List.of(
        List.of(11, 2, 4),
        List.of(4, 5, 6),
        List.of(10, 8, -12));

    int theSumDiff = DiagonalDifference(matrix);
    System.out.println(theSumDiff);
  }

  private static int DiagonalDifference(List<List<Integer>> arr) {
    int firstSum = 0;
    int secondSum = 0;

    for (int i = 0; i < arr.size(); i++) {
      for (int j = 0; j < arr.size(); j++) {
        if (i == j) {
          firstSum += arr.get(i).get(j);
        }
      }
    }
    int i = 0;
    int j = arr.size() - 1;
    int result = 0;
    while (i <= arr.size() && j >= 0) {
      secondSum += arr.get(i).get(j);
      i++;
      j--;
    }
    result = Math.abs(firstSum - secondSum);
    return result;
  }
}
