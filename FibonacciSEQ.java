public class FibonacciSEQ {
  private static long[] fibCache;

  public static void main(String[] args) {
    int n = 69;
    fibCache = new long[n + 1];
    for (int i = 0; i < n; i++) {
      System.out.println(i + "-->" + fibonacciSQ(i));
    }
  }

  private static long fibonacciSQ(int n) {
    if (n <= 1) {
      return n;
    }
    if (fibCache[n] != 0) {
      return fibCache[n];
    }
    long nthFibonacciNum = fibonacciSQ(n - 1) + fibonacciSQ(n - 2);
    fibCache[n] = nthFibonacciNum;
    return nthFibonacciNum;
  }
}
