import java.util.Arrays;

public class BinarySearch {
  public static void main(String[] args) {
    int[] seriesofNumbers = { 12, 14, 16, 17, 85, 5, 42, 23, 54, 96, 56, 45, 43, 32, 99, 33, 6, 77, 66, 98, 56, 43, 21,
        22 };

    System.err.println(BinarySearchDo(seriesofNumbers, 33));
  }

  public static int BinarySearchDo(int[] sortedNumbers, int wantedNumber) {
    // let's set the first and last indecies of the array
    int left = 0;
    int right = sortedNumbers.length - 1;
    // we sort the array just in case it is a series of random numbers
    Arrays.sort(sortedNumbers);
    for (int sortedNum : sortedNumbers) {
      System.out.print(sortedNum + " ");
    }
    System.out.println("");
    // let's split the array into 2 and compare if the middle number is lower or
    // larger than the wanted number
    while (left <= right) {
      int middleIndex = (left + right) / 2;
      int middleNumber = sortedNumbers[middleIndex];
      System.out.println("The last index of this Array is " + right + " and the Middile index is " + middleIndex
          + " ==> " + middleNumber);
      System.out.println("");
      if (wantedNumber == middleNumber) {
        System.out.println("");
        return middleIndex;
      }
      if (wantedNumber < middleNumber) {
        right = middleIndex - 1;
      }
      if (wantedNumber > middleNumber) {
        left = middleIndex + 1;
      }
    }
    return -1;
  }
}
