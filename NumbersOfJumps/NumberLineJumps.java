public class NumberLineJumps {
  public static void main(String[] args) {
    System.out.println(Kangaroo(0, 2, 5, 3));

  }

  public static String Kangaroo(int x1, int v1, int x2, int v2) {

    while (x1 < 10000) {
      x1 += v1;
      x2 += v2;
      if (x1 + v1 == x2 + v2) {
        return "Yes";
      }
    }

    return "No";
  }
}
