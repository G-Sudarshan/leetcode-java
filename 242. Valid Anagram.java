/*
242. Valid Anagram
Easy
8.9K
286
Companies
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

Accepted
2.1M
Submissions
3.4M
Acceptance Rate
63.1%



*/


class Solution {
    public boolean isAnagram(String s, String t) {
        int[] ch = new int[26];
        for(char c : s.toCharArray()){
            ch[c - 97]++;
        }
        for(char c : t.toCharArray()){
            ch[c - 97]--;
        }

        for(int i : ch){
            if(i!=0)
                return false;
        }

        return true;
    }
}
