package TallestCandle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TallestCandles {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    System.out.println("How old are you?");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      nums.add(sc.nextInt());
    }
    int x = tallestCandles(nums);
    System.out.println(x);
    sc.close();
  }

  public static int tallestCandles(List<Integer> candles) {
    int tallestCandle = 0;
    int sumofTallestCandles = 0;

    for (int num : candles) {
      if (num > tallestCandle) {
        tallestCandle = num;
      }
    }

    for (int i = 0; i < candles.size(); i++) {
      if (candles.get(i) == tallestCandle) {
        sumofTallestCandles++;
      }
    }
    return sumofTallestCandles;
  }
}
