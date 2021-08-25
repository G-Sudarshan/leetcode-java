/*
1832. Check if the Sentence Is Pangram
Easy

339

9

Add to List

Share
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
 

Constraints:

1 <= sentence.length <= 1000
sentence consists of lowercase English letters.
Accepted
46,757
Submissions
56,998
*/

class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        boolean[] arr = new boolean[26];
        int temp=0;
        char ch;
        
        
        for(int i=0; i<n; i++){
            ch = sentence.charAt(i);
            temp =  (int)ch % 97;
            arr[temp] = true;
        }
        
        for(int i=0; i<26; i++){
            if(arr[i]==false){
                return false;
            }            
        }
        
        return true;
        
    }
}
