/*
217. Contains Duplicate
Easy

2676

891

Add to List

Share
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
Accepted
1,030,822
Submissions
1,751,264




*/


class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<Integer>();
        
        for(int i: nums){
            if(!h.contains(i)){
                h.add(i);
            }else{
                return true;
            }
        }
        
        return false;
        
    }
}
