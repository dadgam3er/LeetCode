package BobConundrum;

public class BobConundrumSolution {
  // create a class that take a string and check if there a b+"char""+b
  public static boolean BobConundrum(String line) {

    char[] ltrs = line.toCharArray();
    for (int i = 0; i < ltrs.length; i++) {
      if (ltrs[i] == 'b' && ltrs[i + 2] == 'b') {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {

    System.out.println(BobConundrum("bmeanIlllberightbackbrb"));
  }
}
