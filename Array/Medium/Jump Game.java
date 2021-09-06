/*
55. Jump Game
Medium

7615

467

Add to List

Share
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 

Constraints:

1 <= nums.length <= 104
0 <= nums[i] <= 105
Accepted
721,683
Submissions
1,997,894
Seen this question in a real interview before?

Yes

No

*/

class Solution {
    public boolean canJump(int[] nums) {
        int maxAccess = nums[0];

        for (int i=0; i<= maxAccess; i++) {

            if (maxAccess >= nums.length-1){
                return true;
            }

            if (maxAccess< (i+nums[i])){
                maxAccess = i+nums[i];
            }

        }
        return false;
    }
}
