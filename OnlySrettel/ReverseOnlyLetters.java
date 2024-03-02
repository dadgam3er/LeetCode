/**
 * ReverseOnlyLetters
 */
public class ReverseOnlyLetters {

  public static String reversedString(String s) {

    String RevString = "";
    for (int i = 0; i < s.length(); i++) {
      int left = 0;
      int right = s.length() - 1;

      if (Character.isDigit(s.charAt(i))) {
        left = left + 1;
      } else if (Character.isLetter(s.charAt(i))) {
        char temp = s.charAt(i);
        RevString = temp + RevString;
      }
      right--;
    }
    return RevString;
  }

  public static void main(String[] args) {
    String ltrs = "Hello2024World";
    String revStr = reversedString(ltrs);
    System.out.println(revStr);
  }
}
