class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        long total = (long) n * n;

        long sum = 0, sumSq = 0;
        long expectedSum = total * (total + 1) / 2;
        long expectedSumSq = total * (total + 1) * (2 * total + 1) / 6;

        for (int[] row : grid) {
            for (int val : row) {
                sum += val;
                sumSq += (long) val * val;
            }
        }

        // Let repeated = a, missing = b
        // sum - expectedSum = a - b
        // sumSq - expectedSumSq = a^2 - b^2 = (a-b)(a+b)
        long diffSum = sum - expectedSum;              // a - b
        long diffSumSq = sumSq - expectedSumSq;         // a^2 - b^2
        long sumAB = diffSumSq / diffSum;                // a + b

        long a = (diffSum + sumAB) / 2; // repeated
        long b = a - diffSum;           // missing

        return new int[] { (int) a, (int) b };
    }
}