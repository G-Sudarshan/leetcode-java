/*
1886. Determine Whether Matrix Can Be Obtained By Rotation
Easy

245

28

Add to List

Share
Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.

 

Example 1:


Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
Example 2:


Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
Output: false
Explanation: It is impossible to make mat equal to target by rotating mat.
Example 3:


Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.
 

Constraints:

n == mat.length == target.length
n == mat[i].length == target[i].length
1 <= n <= 10
mat[i][j] and target[i][j] are either 0 or 1.
Accepted
16,093
Submissions
29,752


*/

class Solution {
     public boolean findRotation(int[][] mat, int[][] target) {
    
        for(int i=0;i<4;i++){
            mat = rotate(mat);
            if(isEqual(mat, target)){
                return true;
            }
        }
        return false;
    }
    
    public boolean isEqual(int[][] mat, int[][] target){
        boolean isEqual = true;
        for(int i=0;i< mat.length; i++){
            for(int j=0;j<mat.length; j++){
                if(mat[i][j] != target[i][j]){
                    isEqual = false;
                    break;
                }
            }
        }
        
        return isEqual;
    }
    
    public int[][] rotate(int[][] mat){
        // First find transpose, i.e swap across major diagonal
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<i;j++){
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
            }
        }
        
        // Second swap rows across middle
        for(int i=0;i<mat.length; i++){
            for(int j=0;j<mat.length/2;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][mat.length-1-j];
                mat[i][mat.length-1-j] = temp;
            }
        }
        
        return mat;
    }
}
