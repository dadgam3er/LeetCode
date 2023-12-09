import java.util.Scanner;

public class fibonacciSQ {
  private static long[] fibonacciCache;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a positve number that is less than 92");
    int n = sc.nextInt();
    fibonacciCache = new long[n + 1];
    for (int i = 0; i < n; i++) {

      System.out.println(i + " --> " + fibonacciSeq(i));
    }
    sc.close();
  }

  private static long fibonacciSeq(int n) {
    if (n <= 1) {
      return n;
    }
    if (fibonacciCache[n] != 0L) {
      return fibonacciCache[n];
    }

    long nthFibonacciNum = fibonacciSeq(n - 1) + fibonacciSeq(n - 2);
    fibonacciCache[n] = nthFibonacciNum;
    return nthFibonacciNum;
  }
}
