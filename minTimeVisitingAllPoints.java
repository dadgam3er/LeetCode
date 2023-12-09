public class minTimeVisitingAllPoints {
  public int minTimeToVisitAllPoints(int[][] points) {
    int totalTime = 0;
    for (int i = 0; i < points.length - 1; i++) {
      int[] currentPoints = points[i];
      int[] nextPoints = points[i + 1];
      int horizontalMove = Math.abs(nextPoints[0] - currentPoints[0]);
      int verticalMove = Math.abs(nextPoints[1] - currentPoints[1]);

      int maxDiff = Math.max(horizontalMove, verticalMove);
      int minDiff = Math.min(horizontalMove, verticalMove);

      totalTime = totalTime + minDiff + (maxDiff - minDiff);
    }
    return totalTime;
  }

  public static void main(String[] args) {
    minTimeVisitingAllPoints minPoints = new minTimeVisitingAllPoints();

    int[][] points = { { 1, 1 }, { 3, 4 }, { -1, 0 } };
    int results = minPoints.minTimeToVisitAllPoints(points);
    System.out.println(results);
  }
}
