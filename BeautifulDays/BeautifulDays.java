public class BeautifulDays {
  public static void main(String[] args) {

    int beauJours = BeautifulDay(24, 67, 4);
    System.out.println(beauJours);
  }

  public static int reverseInt(int a) {
    int revA = 0;
    while (a > 0) {
      revA = 10 * revA;
      revA += a % 10;
      a /= 10;
    }
    return revA;
  }

  public static int BeautifulDay(int i, int j, int k) {
    int beauxJours = 0;
    for (int x = i; x < j; x++) {
      int r = reverseInt(x);
      if (Math.abs(x - r) % k == 0) {
        beauxJours++;
      }
    }
    return beauxJours;
  }
}
