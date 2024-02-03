import java.util.Scanner;

public class StairCase {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = n; i > 0; i--) {
      for (int k = 1; k <= n; k++) {
        System.out.print(k < i ? " " : "#");
      }
      System.out.println();
    }
    sc.close();
  }
}
