/*
3. Longest Substring Without Repeating Characters
Medium

18476

848

Add to List

Share
Given a string s, find the length of the longest substring without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Example 4:

Input: s = ""
Output: 0
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
Accepted
2,633,717
Submissions
8,135,663


*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hs = new HashSet<>();
        int max = 0;
        int i = 0;
        int j = 0;
        while(j<s.length()){
             if(!hs.contains(s.charAt(j))){
                 hs.add(s.charAt(j++));
                 max = Math.max(max, hs.size());
             }
            else{
                hs.remove(s.charAt(i++));
            }
        }
        
        
        return max;
    }
}
