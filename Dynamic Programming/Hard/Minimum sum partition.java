/*
Minimum sum partition 
Hard Accuracy: 50.0% Submissions: 32091 Points: 8
Given an integer array arr of size N, the task is to divide it into two sets S1 and S2 such that the absolute difference between their sums is minimum and find the minimum difference


Example 1:

Input: N = 4, arr[] = {1, 6, 11, 5} 
Output: 1
Explanation: 
Subset1 = {1, 5, 6}, sum of Subset1 = 12 
Subset2 = {11}, sum of Subset2 = 11   
Example 2:
Input: N = 2, arr[] = {1, 4}
Output: 3
Explanation: 
Subset1 = {1}, sum of Subset1 = 1
Subset2 = {4}, sum of Subset2 = 4

Your Task:  
You don't need to read input or print anything. Complete the function minDifference() which takes N and array arr as input parameters and returns the integer value


Expected Time Complexity: O(N*|sum of array elements|)
Expected Auxiliary Space: O(N*|sum of array elements|)


Constraints:
1 ≤ N*|sum of array elements| ≤ 106

*/
class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    int range = 0;
	    int min = Integer.MAX_VALUE;
	    for(int i=0; i < n; i++){
	        range = range + arr[i];
	    }
	    
	    ArrayList res = SubsetSum(n, arr, range);
	    
	    for(int i=0; i < res.size() ; i++){
	        min = Math.min(min, range-(2*(int)(res.get(i))));
	    }
	    return min;
	} 
	
	static ArrayList SubsetSum(int N, int arr[], int sum){
        // code here
        boolean[][] dp = new boolean[N+1][sum+1];
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        for(int i=0; i<N+1 ; i++){
            for(int j=0; j < sum+1; j++){
                if(i==0){
                    dp[i][j] = false;
                }
                if(j==0){
                    dp[i][j] = true;
                }
            }
        }
        
        for(int i=1; i<N+1; i++){
            for(int j=1; j<sum+1; j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        for(int i=0 ; i < (sum/2)+1; i++ ){
            if(dp[N][i]){
            res.add(i);
        }
        }
        
        return res;
        
    }
}
