package Min_Max;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinMaxSum {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    List<Integer> arr = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      arr.add(sc.nextInt());
    }

    sumMinMax(arr);
    sc.close();

    sumMinMax(arr);
  }

  public static void sumMinMax(List<Integer> arr) {
    Collections.sort(arr);

    long minSum = 0;
    long maxSum = 0;

    for (int i = 0; i < arr.size() - 1; i++) {
      minSum += arr.get(i);
    }

    for (int i = 1; i < arr.size(); i++) {
      maxSum += arr.get(i);
    }

    System.out.println(minSum + " " + maxSum);
  }
}
