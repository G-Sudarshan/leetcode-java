class Solution {
    public boolean exist(char[][] maze, String word) {
        for(int i=0; i<maze.length; i++){
            for(int j=0; j<maze[0].length; j++){
                if(maze[i][j]==word.charAt(0)){
                    boolean ans = findWord(maze, word, i, j, 0);
                    if(ans == true){
                        return ans;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean findWord(char[][] maze, String word, int cr, int cc, int idx){
        if(idx==word.length()){
            return true;
        }
        
        if(cr<0 || cr>=maze.length || cc<0 || cc>=maze[0].length || maze[cr][cc]!=word.charAt(idx)){
            return false;
        }
        
        int[] r = {-1,1,0,0};
        int[] c = {0,0,1,-1};
        maze[cr][cc] = '*';
        
        for(int i=0; i<c.length; i++){
            boolean ans = findWord(maze, word, cr+r[i], cc+c[i], idx+1);
            if(ans==true){
                return ans;
            }
        }
        maze[cr][cc] = word.charAt(idx);
        return false;
    }
}