/*
1. Two Sum
Easy

24094

800

Add to List

Share
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
Accepted
4,871,630
Submissions
10,247,572


*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int sum=0;
        for(int i=0; i < nums.length; i++){
            for(int j=(i+1); j < nums.length; j++){
                sum = nums[i] + nums[j];
                if(sum==target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        
        return res;
    }
}