package PlusMinus;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PlusMinus {
  public static void main(String[] args) {
    List<Integer> listOfNum = List.of(-4, 3, -9, 0, 4, 1);
    Set<Float> Result = plusMunisArr(listOfNum);
    System.out.println(Result);
  }

  public static Set<Float> plusMunisArr(List<Integer> arr) {
    int n = arr.size();
    Set<Float> finalResult = new HashSet<>();
    float PosResult = 0; float NegResult = 0; float ZeroResult = 0;
    int PosInt = 0;
    int NegInt = 0;
    int ZeroSum = 0;
    for (int num : arr) {
      if (num > 0) {
        PosInt++;
        PosResult = (float) PosInt /n;

      } else if (num < 0) {
        NegInt++;
        NegResult = (float) NegInt /n;
      } else {
        ZeroSum++;
        ZeroResult = (float) ZeroSum /n;
      }
      finalResult.add(PosResult);
      finalResult.add(NegResult);
      finalResult.add(ZeroResult);
    }
    return finalResult;
  }
}
