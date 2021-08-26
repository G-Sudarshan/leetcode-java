/*
832. Flipping an Image
Easy

1543

191

Add to List

Share
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].
 

Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
Example 2:

Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 

Constraints:

n == image.length
n == image[i].length
1 <= n <= 20
images[i][j] is either 0 or 1.
Accepted
254,850
Submissions
323,309

*/

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] res = new int[image.length][image.length];
        int k=0;
        
        for(int i = 0 ; i < image.length ; i++ ){
            k=0;
            for(int j = (image.length - 1); j >= 0; j-- ){
                res[i][k] = image[i][j];
                k++;
            }
        }
        
        for(int i=0; i < image.length; i++){
            for(int j=0 ; j < image.length; j++){
                if(res[i][j]==1){
                    res[i][j]=0;
                }else{
                    res[i][j]=1;
                }
            }
        }
        
        return res;
    }
}
