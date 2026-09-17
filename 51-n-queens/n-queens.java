class Solution {

    public boolean isSafe(int row, int col, char[][] board) {

        // Check row
        for(int j = 0; j < board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        // Check column
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // Upper-left diagonal
        int r = row;

        for(int c = col; c >= 0 && r >= 0; c--, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // Upper-right diagonal
        r = row;

        for(int c = col; c < board.length && r >= 0; c++, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // Lower-left diagonal
        r = row;

        for(int c = col; c >= 0 && r < board.length; c--, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // Lower-right diagonal
        r = row;

        for(int c = col; c < board.length && r < board.length; c++, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards){

        List<String> newBoard = new ArrayList<>();

        for(int i = 0; i < board.length; i++){

            String row = "";

            for(int j = 0; j < board[0].length; j++){

                if(board[i][j] == 'Q'){
                    row += 'Q';
                }
                else{
                    row += '.';
                }
            }

            newBoard.add(row);
        }

        allBoards.add(newBoard);
    }

    public void helper(char[][] board, List<List<String>> allBoards, int col){

        // Base case
        if(col == board.length){
            saveBoard(board, allBoards);
            return;
        }

        // Try every row
        for(int row = 0; row < board.length; row++){

            if(isSafe(row, col, board)){

                // Place queen
                board[row][col] = 'Q';

                // Move to next column
                helper(board, allBoards, col + 1);

                // Backtracking
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> allBoards = new ArrayList<>();

        char[][] board = new char[n][n];

        // Initialize board
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }

        helper(board, allBoards, 0);

        return allBoards;
    }
}