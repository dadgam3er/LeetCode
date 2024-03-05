public class TargetNum {
  public static void main(String[] args) {
    int[] hrs = { 3, 5, 7, 6, 2, 8, 9 };
    int tar = 4;

    System.out.println(targetNumber(hrs, tar));
  }

  public static int targetNumber(int[] hours, int target) {
    int count = 0;

    for (int x : hours) {
      if (x >= target) {
        count++;
      }
    }
    return count;
  }
}
