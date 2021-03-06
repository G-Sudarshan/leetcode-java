/*

1499. Max Value of Equation
Hard

575

25

Add to List

Share
You are given an array points containing the coordinates of points on a 2D plane, sorted by the x-values, where points[i] = [xi, yi] such that xi < xj for all 1 <= i < j <= points.length. You are also given an integer k.

Return the maximum value of the equation yi + yj + |xi - xj| where |xi - xj| <= k and 1 <= i < j <= points.length.

It is guaranteed that there exists at least one pair of points that satisfy the constraint |xi - xj| <= k.

 

Example 1:

Input: points = [[1,3],[2,0],[5,10],[6,-10]], k = 1
Output: 4
Explanation: The first two points satisfy the condition |xi - xj| <= 1 and if we calculate the equation we get 3 + 0 + |1 - 2| = 4. Third and fourth points also satisfy the condition and give a value of 10 + -10 + |5 - 6| = 1.
No other pairs satisfy the condition, so we return the max of 4 and 1.
Example 2:

Input: points = [[0,0],[3,0],[9,2]], k = 3
Output: 3
Explanation: Only the first two points have an absolute difference of 3 or less in the x-values, and give the value of 0 + 0 + |0 - 3| = 3.
 

Constraints:

2 <= points.length <= 105
points[i].length == 2
-108 <= xi, yi <= 108
0 <= k <= 2 * 108
xi < xj for all 1 <= i < j <= points.length
xi form a strictly increasing sequence.
Accepted
21,266
Submissions
46,067


*/

class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        Deque<int[]> deque = new LinkedList<>();
		int res = Integer.MIN_VALUE;
        
		for (int[] point : points) {
			int x_j = point[0];
            int y_j = point[1];
            
			// discard objects that we will never use since too far away
			while (!deque.isEmpty() && x_j - deque.peekFirst()[0] > k)
                deque.pollFirst();
            
			
            int sum_j = x_j + y_j;
            
			if (!deque.isEmpty())
                res = Math.max(res, deque.peekFirst()[1] + sum_j);
            
			
            int diff_j = y_j - x_j;
            
            // discard objects that are inferior (x_i is further than x_j and it's value is smaller)
			while (!deque.isEmpty() &&  diff_j > deque.peekLast()[1])
                deque.pollLast();
            
			
            deque.offerLast(new int[]{x_j, diff_j});
        }
        
		return res;
    }
}
