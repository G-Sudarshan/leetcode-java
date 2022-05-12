class Solution {
      public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] != '.'){
                    if (isValid(board, row, col, board[row][col])){
                        continue;
                    }else{ 
                        return false;
                    }
            }
        }
        }
          return true;
      }
        
    
    static boolean isValid(char[][] board, int row, int col, int c) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == c && i != col) {
                return false;
            }

            if (board[i][col] == c && i != row) {
                return false;
            }
            int curRow = 3 * (row / 3) + i / 3;
            int curCol = 3 * (col / 3) + i % 3;
            if (board[curRow][curCol] == c && curRow != row && curCol != col) {
                return false;
            }
        }
        return true;
    }
}