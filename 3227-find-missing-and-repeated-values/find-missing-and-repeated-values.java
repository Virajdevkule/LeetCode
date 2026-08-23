class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        int total = n * n;

        int[] ans = new int[2];
        int[] freq = new int[total + 1];

        // Count every number
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }
        }

        // Find repeated and missing
        for (int i = 1; i <= total; i++) {

            if (freq[i] == 2) {
                ans[0] = i;       // repeated
            }

            if (freq[i] == 0) {
                ans[1] = i;       // missing
            }
        }

        return ans;
    }
}