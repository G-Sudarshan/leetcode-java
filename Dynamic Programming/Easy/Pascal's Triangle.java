/*

118. Pascal's Triangle
Easy

3903

170

Add to List

Share
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 

Constraints:

1 <= numRows <= 30
Accepted
613,834
Submissions
1,018,786


*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> solution = new ArrayList<>();
        solution.add(List.of(1));
        
        for (int level = 1; level < numRows ; level++) {
            List<Integer> prev = solution.get(level - 1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int pos = 1; pos < level; pos++) {
                curr.add(prev.get(pos - 1) + prev.get(pos));
            }
            curr.add(1);
            solution.add(curr);
        }
        
        return solution;
    }
}
