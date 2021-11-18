/*
494. Target Sum
Medium

5522

216

Add to List

Share
You are given an integer array nums and an integer target.

You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.

For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
Return the number of different expressions that you can build, which evaluates to target.

 

Example 1:

Input: nums = [1,1,1,1,1], target = 3
Output: 5
Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3
Example 2:

Input: nums = [1], target = 1
Output: 1
 

Constraints:

1 <= nums.length <= 20
0 <= nums[i] <= 1000
0 <= sum(nums[i]) <= 1000
-1000 <= target <= 1000
Accepted
292,342
Submissions
645,590
*/
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
       
        int arr_sum = 0;
        int arr_diff = target;
        
        for(int x: nums){
            arr_sum += x;
        }
        
         if(((arr_sum - target) % 2 == 1) || (target > arr_sum) || (target < -arr_sum)){
            return 0;
         }
        
        int s1 = (arr_diff + arr_sum)/2;
        return countSubsetSum(nums, s1);
        
    }
    
    public int countSubsetSum(int[] arr, int sum){
        int n = arr.length;
        int[][] dp = new int[n+1][sum+1];
        dp[0][0] = 1;
        
        
        for(int i=1; i<n+1; i++){
            for(int j=0; j<sum+1; j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
                
            }
            
        }
        return dp[n][sum];
    }
}
