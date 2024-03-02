/*
Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas.

The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile
of bananas and eats k bananas from that pile.

If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.
 */
public class Koko {
  public int speedofK(int[] piles, int h) {
    int left = 1; // Minimum speed of eating
    int right = getMaxPile(piles); // Maximum speed of eating based on the largest piles

    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (canEatInTime(piles, mid, h))
        right = mid - 1;
      else
        left = mid + 1;
    }
    return left;
  }

  public boolean canEatInTime(int[] piles, int k, int h) {
    int hours = 0;
    for (int pile : piles) {
      hours += (pile + k - 1) / k; // Calculate hours needed to eat the pile at speed k
    }
    return hours <= h;
  }

  // Utility method to get the maximum pile
  private int getMaxPile(int[] piles) {
    int max = Integer.MIN_VALUE;
    for (int pile : piles) {
      max = Math.max(max, pile);
    }
    return max;
  }

  public static void main(String[] args) {
    Koko koko = new Koko();

    int[] piles = { 30, 11, 23, 4, 20 };
    int h = 5;
    int results = koko.speedofK(piles, h); // Pass both piles array and h to speedofK method
    System.out.println(results);
  }
}
