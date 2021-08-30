/*

1572. Matrix Diagonal Sum
Easy

624

12

Add to List

Share
Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

 

Example 1:


Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
Example 2:

Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8
Example 3:

Input: mat = [[5]]
Output: 5
 

Constraints:

n == mat.length == mat[i].length
1 <= n <= 100
1 <= mat[i][j] <= 100
Accepted
65,979
Submissions
84,357
*/

class Solution {
    public int diagonalSum(int[][] mat) {
        int res=0;
        int n=mat.length;
        
        
        for(int i=0 ; i < n;){
            for(int j=0; j < n ; ){
                res += mat[i++][j++];
            }
        }
        
        for(int i=0 ; i < n;){
            for(int j=n-1; j >= 0 ; ){
                res += mat[i++][j--];
            }
        }
        
        
        if(n%2==1){
            int center_index = (int)Math.ceil(n/2);
            res = res - mat[center_index][center_index];
        }
        
        return res;
    }
}
