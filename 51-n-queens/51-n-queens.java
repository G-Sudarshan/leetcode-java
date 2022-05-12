class Solution {
     List<List<String>> res = new ArrayList<>();
     public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }       
       solve(board, 0, n);
       return res;
    }
    
    public void solve(char[][] board, int row, int n){
        if(row==n){
            // save in result
            List<String> t = new ArrayList<>();
            for(char[] s: board){
                t.add(new String(s));
            }
            res.add(t);
            return;
        }
        
        for(int col=0; col<n; col++){
            if(isValid(board, row, col)){
                board[row][col] = 'Q';
                solve(board, row+1, n);
                board[row][col] = '.';
            }
        }
        
    }
    
    public boolean isValid(char[][] board, int row, int col){
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q')
                return false;
        }
        
        for(int i= row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q')
                return false;
        }
        
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q')
                return false;
        }
        return true;
    }
    
    
}