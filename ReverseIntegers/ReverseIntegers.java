package ReverseIntegers;

import java.util.Scanner;

public class ReverseIntegers {
  public static int reverseInt() {
    int revInt = 0, remainderInt = 0;
    Scanner sc = new Scanner(System.in);

   System.out.print( "Please enter a number => ");
    int a = sc.nextInt();

    while (a != 0) {
      remainderInt = a % 10;
      revInt *= 10;
      revInt += remainderInt;
      a /= 10;
    }
    return revInt;
  }

  public static void main(String[] args) {

    System.out.println(reverseInt());
  }
}
