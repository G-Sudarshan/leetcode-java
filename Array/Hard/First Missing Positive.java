/*

41. First Missing Positive
Hard

6986

1109

Add to List

Share
Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.

 

Example 1:

Input: nums = [1,2,0]
Output: 3
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
 

Constraints:

1 <= nums.length <= 5 * 105
-231 <= nums[i] <= 231 - 1
Accepted
545,402
Submissions
1,561,186

*/

class Solution {
    public int firstMissingPositive(int[] arr) {
        int i = 0;
        while( i < arr.length) {
            int correct = arr[i] -1;
            if(arr[i] > 0 && arr[i] < arr.length && arr[correct] != arr[i]){
                swap(arr, correct, i);
            }
            else{
                i++;
            }
        }
        for(int j = 0; j < arr.length; j++){
            if (arr[j] != j +1){
                return j+1;
            }
        }
        return arr.length + 1 ;
    }
    
    public void swap(int[] arr, int correct, int i){
        int temp = arr[correct];
        arr[correct] = arr[i];
        arr[i] = temp;
    }
    
}
