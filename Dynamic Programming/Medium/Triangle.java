/*

120. Triangle
Medium

3868

356

Add to List

Share
Given a triangle array, return the minimum path sum from top to bottom.

For each step, you may move to an adjacent number of the row below. More formally, if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.

 

Example 1:

Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
Output: 11
Explanation: The triangle looks like:
   2
  3 4
 6 5 7
4 1 8 3
The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
Example 2:

Input: triangle = [[-10]]
Output: -10
 

Constraints:

1 <= triangle.length <= 200
triangle[0].length == 1
triangle[i].length == triangle[i - 1].length + 1
-104 <= triangle[i][j] <= 104
 

Follow up: Could you do this using only O(n) extra space, where n is the total number of rows in the triangle?
Accepted
355,945
Submissions
730,668

*/

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        ArrayList<ArrayList<Integer>> dp = new ArrayList<ArrayList<Integer>>();
        int temp=0;
        
        for(int i=0; i< n; i++){
            dp.add(new ArrayList<Integer>());
            for(int j=0; j< triangle.get(i).size(); j++){
                if(i==0){
                    temp = triangle.get(0).get(0);
                    dp.get(0).add(0, temp);
                    continue;
                }
                
                if(j==0){
                    temp = dp.get(i-1).get(0) + triangle.get(i).get(0);
                    dp.get(i).add(0, temp);
                    continue;
                }
                if(i==j){
                    temp = dp.get(i-1).get(j-1) + triangle.get(i).get(j);
                    dp.get(i).add(j, temp);
                    continue;
                }
                temp = Math.min(dp.get(i-1).get(j-1), dp.get(i-1).get(j)) + triangle.get(i).get(j);
                dp.get(i).add(j, temp);
            }
            
        }
        temp = Collections.min(dp.get(n-1));
        return temp;
    }
}
