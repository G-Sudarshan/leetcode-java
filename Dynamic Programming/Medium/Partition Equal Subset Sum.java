/*
Partition Equal Subset Sum 
Medium Accuracy: 38.0% Submissions: 75900 Points: 4
Given an array arr[] of size N, check if it can be partitioned into two parts such that the sum of elements in both parts is the same.

Example 1:

Input: N = 4
arr = {1, 5, 11, 5}
Output: YES
Explaination: 
The two parts are {1, 5, 5} and {11}.
Example 2:

Input: N = 3
arr = {1, 3, 5}
Output: NO
Explaination: This array can never be 
partitioned into two such parts.

Your Task:
You do not need to read input or print anything. Your task is to complete the function equalPartition() which takes the value N and the array as input parameters and returns 1 if the partition is possible. Otherwise, returns 0.


Expected Time Complexity: O(N*sum of elements)
Expected Auxiliary Space: O(N*sum of elements)


Constraints:
1 ≤ N ≤ 100
1 ≤ arr[i] ≤ 1000
*/

class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum=0, W=0;
        
        for(int i=0; i<N; i++){
            sum = sum + arr[i];
        }
        
        if(sum%2 != 0){
            return 0;
        }
        W = sum/2;
        boolean[][] dp = new boolean[N+1][W+1];
        
        for(int i=0; i < N+1; i++){
            for(int j=0; j < W+1; j++){
                if(i==0){
                    dp[i][j] = false;
                }
                if(j==0){
                    dp[i][j] = true;
                }
            }
        }
        
        for(int i=1; i<N+1; i++){
            for(int j=1; j<W+1; j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        if(dp[N][W]){
            return 1;
        }
        return 0;
    }
}
