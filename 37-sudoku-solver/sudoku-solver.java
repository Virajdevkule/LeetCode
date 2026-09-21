class Solution {

    public boolean isSafe(char[][] board, int row, int col, int number) {

        // Check column and row
        for (int i = 0; i < board.length; i++) {

            // Column
            if (board[i][col] == (char)(number + '0')) {
                return false;
            }

            // Row
            if (board[row][i] == (char)(number + '0')) {
                return false;
            }
        }

        // Find starting row and column of 3x3 box
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        // Check 3x3 box
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {

                if (board[i][j] == (char)(number + '0')) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean helper(char[][] board, int row, int col) {

        // All rows completed
        if (row == board.length) {
            return true;
        }

        // Calculate next cell
        int nrow;
        int ncol;

        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        // If cell is already filled
        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        }

        // Cell is empty, try 1 to 9
        for (int i = 1; i <= 9; i++) {

            if (isSafe(board, row, col, i)) {

                // Place number
                board[row][col] = (char)(i + '0');

                // Solve next cell
                if (helper(board, nrow, ncol)) {
                    return true;
                }

                // Backtrack
                board[row][col] = '.';
            }
        }

        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}