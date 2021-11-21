/*
Number of Coins 
Medium Accuracy: 47.78% Submissions: 31306 Points: 4
Given a value V and array coins[] of size M, the task is to make the change for V cents, given that you have an infinite supply of each of coins{coins1, coins2, ..., coinsm} valued coins. Find the minimum number of coins to make the change. If not possible to make change then return -1.


Example 1:

Input: V = 30, M = 3, coins[] = {25, 10, 5}
Output: 2
Explanation: Use one 25 cent coin
and one 5 cent coin
Example 2:
Input: V = 11, M = 4,coins[] = {9, 6, 5, 1} 
Output: 2 
Explanation: Use one 6 cent coin
and one 5 cent coin

Your Task:  
You don't need to read input or print anything. Complete the function minCoins() which takes V, M and array coins as input parameters and returns the answer.

Expected Time Complexity: O(V*M)
Expected Auxiliary Space: O(V)

Constraints:
1 ≤ V*M ≤ 106
All array elements are distinct
*/
class Solution{

	public int minCoins(int coins[], int M, int V) 
	{ 
	    // Your code goes here
	    int INF = Integer.MAX_VALUE-1;
	    int[][] t = new int[M+1][V+1];
	    
	    for(int i=0; i<M+1; i++){
	        for(int j=0; j<V+1; j++){
	            if(j==0){
	                t[i][j] = 0;
	            }
	            if(i==0){
	                t[i][j] = INF;
	            }
	        }
	    }
	    
	    for(int j=1; j<V+1; j++){
	        if(j%coins[0]==0){
	            t[1][j] = j/coins[0];
	        }else{
	            t[1][j] = INF;
	        }
	    }
	    
	    for(int i=2; i<M+1;i++){
	        for(int j=1; j<V+1; j++){
	            if(coins[i-1]<=j){
	                t[i][j] = Math.min(1+t[i][j-coins[i-1]],t[i-1][j]);
	            }
	            else{
	                t[i][j] = t[i-1][j];
	            }
	        }
	    }
	    
	    if(t[M][V]==INF){
	        return -1;
	    }
	    
	    return t[M][V];
	} 
}
