import java.util.ArrayList;

public class uniqueNumber {
  public static void main(String[] args) {
    int[] arr = { 3, 3, 3, 5, 6, 6, 6, 6, 6, 6, 5, 5, 2, 2, 2, 2, 2, 2, 2, 2, 2, 8, 7, 7, 7 };
    // print the unique numbers and how many times they were repeated in this array
    ArrayList<Integer> uniqueNumbers = new ArrayList<>();
    ArrayList<Integer> counts = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      if (!uniqueNumbers.contains(arr[i])) {
        uniqueNumbers.add(arr[i]);
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
          if (arr[j] == arr[i]) {
            count++;
          }
        }
        counts.add(count);
      }
    }

    for (int i = 0; i < uniqueNumbers.size(); i++) {
      System.out.println("Number " + uniqueNumbers.get(i) + " occurs " + counts.get(i) + " times");
    }
  }
}
