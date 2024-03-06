public class ArrayConcat {
  public static void main(String[] args) {
    int[] Ar = { 1, 2, 3, 4, 5 };
    int rc = 3;

    int[] Ar2 = concatArr(Ar, rc);
    for (int x : Ar2) {
      System.out.print(x + " ");
    }
  }

  public static int[] concatArr(int[] arr, int repeatCount) {
    // Calculate the length of the new Array
    int newL = arr.length * repeatCount;

    // Create a new Array with new Length
    int[] arr2 = new int[newL];

    // Copy the elements of the original to the new one
    for (int i = 0; i < repeatCount; i++) {
      for (int j = 0; j < arr.length; j++) {
        arr2[i * arr.length + j] = arr[j];
      }
    }
    return arr2;
  }
}
