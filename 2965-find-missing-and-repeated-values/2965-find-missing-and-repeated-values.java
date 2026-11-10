class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        long N = (long) n * n;

        long sum = N * (N + 1) / 2;

        long squareSum = N * (N + 1) * (2 * N + 1) / 6;

        long actualSum = 0;
        long actualSquareSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                actualSum += grid[i][j];

                actualSquareSum += (long) grid[i][j] * grid[i][j];
            }
        }

        long diff = actualSum - sum;
        long squareDiff = actualSquareSum - squareSum;

        long sumAB = squareDiff / diff;

        long a = (diff + sumAB) / 2;
        long b = sumAB - a;

        return new int[]{(int) a, (int) b};
    }
}