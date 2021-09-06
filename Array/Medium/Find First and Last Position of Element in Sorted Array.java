/*

34. Find First and Last Position of Element in Sorted Array
Medium

7020

232

Add to List

Share
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
Accepted
808,593
Submissions
2,097,694


*/


class Solution {
    public int[] searchRange(int[] nums, int target) {      
        int sol[]={-1,-1};
        sol[0]=b(nums,target,true);
        sol[1]=b(nums,target,false);
        return sol;
        }
        int b(int arr[], int x,boolean y)
        {
        int l = 0, r = arr.length - 1,ans=-1;

            while (l <= r) {
                int m = l + (r - l) / 2;

                // If x is smaller, ignore right half
                if (arr[m] > x)
                    r = m - 1; 

                // If x greater, ignore left half
               else  if (arr[m] < x)
                 l = m + 1   ;


                else
        {
        ans=m;
        if(y){
        r=m-1;
        }else{
        l=m+1;
        }
    }
    }

return ans;
    }
}
