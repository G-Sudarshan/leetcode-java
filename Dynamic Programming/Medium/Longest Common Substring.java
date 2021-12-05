/*
Longest Common Substring 
Medium Accuracy: 52.09% Submissions: 34462 Points: 4
Given two strings. The task is to find the length of the longest common substring.


Example 1:

Input: S1 = "ABCDGH", S2 = "ACDGHR"
Output: 4
Explanation: The longest common substring
is "CDGH" which has length 4.
Example 2:

Input: S1 = "ABC", S2 "ACB"
Output: 1
Explanation: The longest common substrings
are "A", "B", "C" all having length 1.

Your Task:
You don't need to read input or print anything. Your task is to complete the function longestCommonSubstr() which takes the string S1, string S2 and their length n and m as inputs and returns the length of the longest common substring in S1 and S2.

*/

class Solution{
    int longestCommonSubstr(String s1, String s2, int m, int n){
        // code here
        int[][] t = new int[m+1][n+1];
        int max = 0;
        
        for(int i=1; i<m+1; i++){
            for(int j=1; j<n+1; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    t[i][j] = t[i-1][j-1] + 1;
                }else{
                    t[i][j] = 0;
                }
                
                if(t[i][j]>max){
                    max = t[i][j];
                }
            }
        }
        
        return max;
    }
}
