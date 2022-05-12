class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(newColor == image[sr][sc]){
          return image;
        }
        int sourceColor = image[sr][sc];
        solve(image, sr, sc, newColor, sourceColor);
        return image;
    }
    
    public void solve(int[][] image, int sr, int sc, int newColor, int sourceColor){
        
        if(sr<0 || sc <0 || sr >= image.length || sc >= image[0].length)
            return;
        if(image[sr][sc] != sourceColor)
            return;
            
        
        image[sr][sc] = newColor;
        solve(image, sr-1, sc, newColor, sourceColor);
        solve(image, sr, sc+1, newColor, sourceColor);
        solve(image, sr, sc-1, newColor, sourceColor);
        solve(image, sr+1, sc, newColor, sourceColor);
    }
}