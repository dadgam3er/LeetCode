import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BetweenTwoSets {
  public static void main(String[] args) {
    List<Integer> L1 = new ArrayList<>();
    List<Integer> L2 = new ArrayList<>();
    L1.add(2);
    L1.add(4);
    L2.add(16);
    L2.add(32);
    L2.add(96);

    System.out.println(getTotalX(L1, L2));
  }

  public static int getTotalX(List<Integer> a, List<Integer> b) {
    // int len = a.size() + b.size();
    // int total = 0;
    //
    // Map<Integer, Integer> map = new HashMap<>();
    //
    // for (Integer element : a) {
    // int multiple = element;
    // while (multiple <= Collections.max(b)) {
    // map.put(multiple, map.getOrDefault(multiple, 0) + 1);
    // multiple += element;
    // }
    // }
    //
    // for (Integer el : b) {
    // int i = Collections.min(a);
    // while (i <= el) {
    // if (el % i == 0) {
    // map.put(i, map.getOrDefault(i, 0) + 1);
    // }
    // i++;
    // }
    // }
    //
    // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    // if (entry.getValue() == len)
    // total++;
    // }
    // return total;
    int total = 0;
    int minB = b.stream().mapToInt(Integer::valueOf).min().getAsInt();
    System.out.println(minB);
    int maxA = a.stream().mapToInt(Integer::valueOf).max().getAsInt();
    System.out.println(maxA);

    for (int i = maxA; i <= minB; i++) {
      boolean FLAG = true;
      for (Integer n1 : a) {
        if (i % n1 != 0) {
          FLAG = false;
          break;
        }
      }
      if (FLAG) {
        for (Integer n2 : b) {
          if (n2 % i != 0) {
            FLAG = false;
            break;
          }
        }
      }
      if (FLAG) {
        total++;
      }
    }

    return total;
  }
}
