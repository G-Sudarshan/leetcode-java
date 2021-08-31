/*

867. Transpose Matrix
Easy

803

349

Add to List

Share
Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.



 

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:

Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 1000
1 <= m * n <= 105
-109 <= matrix[i][j] <= 109
Accepted
109,638
Submissions
178,088

*/

class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int res[][] = new int[n][m];
        int a=0, b=0;
        
        for(int i=0; i < m; i++){
            a = 0;
            for(int j=0; j < n; j++){
                res[a][b] = matrix[i][j];
                a++;
            }
            b++;
        }
        
        return res;
    }
}
