public class BeautifulDays {
  public static void main(String[] args) {

    int x = beautifulDays(20 , 23, 2);
    System.out.println(x);
  }

  public static int ReverseInt(int a){
    int revA = 0;
    int remainder = 0;
    while (a != 0){
      remainder = a % 10;
      revA *= 10;
      revA += remainder;
      a = a / 10;
    }
    return revA;
  }

  public static int beautifulDays(int i, int j, int k) {

    int beauxJours = 0;
    int m =0;
    int h =0;
    for (int x = i; x <= j; x++) {
      m = ReverseInt(x);

       h = (Math.abs(x - m) % k);
      if (h == 0) {

        beauxJours++;
      }
    }
    System.out.println(m);
    System.out.println(h);
    return beauxJours;
  }
  /*
  int count = 0 ;
    for (int l = i; l <= j; l++) {
        int m = reverseit(l);
        if (Math.abs(l-m) % k == 0) {
            count++;
            System.out.println(count+")"+l +"-"+reverseit(l) +"="+Math.abs(l-m)+"("+k+")");
        }
    }
    return count ;
*/

}
