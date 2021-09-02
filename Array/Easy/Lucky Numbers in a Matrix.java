/*

1380. Lucky Numbers in a Matrix
Easy

624

53

Add to List

Share
Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

 

Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column
Example 2:

Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 3:

Input: matrix = [[7,8],[1,2]]
Output: [7]
 

Constraints:

m == mat.length
n == mat[i].length
1 <= n, m <= 50
1 <= matrix[i][j] <= 10^5.
All elements in the matrix are distinct.
Accepted
51,287
Submissions
72,806


*/

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        //array list to store the lucky numbers
        ArrayList<Integer> list = new ArrayList<>();
        //2D array to mark the min row elements and max column elements
        int[][] arr = new int[matrix.length][matrix[0].length];
        
        int minRow;
        int maxCol;
        
        //for finding the min element in each row
        for(int i=0; i<matrix.length; i++){
            int col=0;
            minRow = Integer.MAX_VALUE;
            for(int j=0; j<matrix[0].length; j++){
                if(minRow > matrix[i][j]){
                    minRow = matrix[i][j];
                    col = j;
                }
            }
            arr[i][col]++;
        }
            
        //for finding the max element in each column
        for(int i=0; i<matrix[0].length; i++){
            int row=0;
            maxCol = Integer.MIN_VALUE;
            for(int j=0; j<matrix.length; j++){
                if(maxCol < matrix[j][i]){
                    maxCol = matrix[j][i];
                    row = j;
                }
            }
            arr[row][i]++;
        }
        
        //for adding the lucky numbers to the list
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(arr[i][j] == 2){
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }
}
