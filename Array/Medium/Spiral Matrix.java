/*

54. Spiral Matrix
Medium

4739

706

Add to List

Share
Given an m x n matrix, return all elements of the matrix in spiral order.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
Accepted
556,169
Submissions
1,455,092


*/

class Solution {
    private final int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        
        spiral(matrix, 0, 0, list, dirs[0]);
        return list;
    }
    
    private void spiral(int[][] matrix, int i, int j, List<Integer> list, int[] lastDir){
        if(i<0 || j<0 || i>=matrix.length || j >= matrix[0].length || matrix[i][j] == -101) return;
        
        list.add(matrix[i][j]);
        matrix[i][j] = -101;
        spiral(matrix, i+lastDir[0], j+lastDir[1], list, lastDir);
        for(int[] dir: dirs){
            spiral(matrix, i+dir[0], j+dir[1], list, dir);
        }
    }
    
}
