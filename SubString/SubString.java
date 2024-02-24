package SubString;

import java.util.Scanner;

public class SubString {
  public static void main(String[] args) {

    System.out.println(subString());
  }

  private static String subString() {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int start = sc.nextInt();
    int end = sc.nextInt();
    char[] ltrs = str.toCharArray();
    String subStr = "";

    for (int i = start; i < end; i++) {
      subStr += Character.toString(ltrs[i]);
    }
    sc.close();
    return subStr;
  }
}
