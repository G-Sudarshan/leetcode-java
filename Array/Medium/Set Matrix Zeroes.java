/*

73. Set Matrix Zeroes
Medium

4506

406

Add to List

Share
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.

You must do it in place.

 

Example 1:


Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 

Constraints:

m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-231 <= matrix[i][j] <= 231 - 1
 

Follow up:

A straightforward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?
Accepted
511,930
Submissions
1,105,834



*/

class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> rows_containing_zeroes = new ArrayList<Integer>();
        List<Integer> cols_containing_zeroes = new ArrayList<Integer>();
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[0].length; j++){
                if(matrix[i][j]==0){
                    rows_containing_zeroes.add(i);
                    cols_containing_zeroes.add(j);
                }
            }
        }
        
        for(int i: rows_containing_zeroes){
            modify_row(i, matrix);
        }
        
        for(int j: cols_containing_zeroes){
            modify_column(j, matrix);
        }
        
        
    }
    
    public void modify_column(int j, int[][] matrix){
        int n = matrix.length;
        for(int i=0; i < n; i++){
            matrix[i][j] = 0;
        }
    }
    
    public void modify_row(int i, int[][] matrix){
        int n = matrix[0].length;
        for(int j=0; j<n ; j++){
            matrix[i][j] = 0;
        }
    }
}
