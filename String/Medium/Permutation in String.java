/*
567. Permutation in String
Medium

3480

92

Add to List

Share
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
 

Constraints:

1 <= s1.length, s2.length <= 104
s1 and s2 consist of lowercase English letters.
Accepted
240,076
Submissions
540,679
*/
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        int l = s2.length();
        
        if(l < k) return false;
        
        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];
        
        for(int i = 0; i< k; i++) {
            s1Freq[s1.charAt(i) - 'a']++;
            s2Freq[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(s2Freq, s1Freq)) {
            return true;
        }
        
        for(int j = k; j < l; j++) {
            s2Freq[s2.charAt(j-k) - 'a']--;
            s2Freq[s2.charAt(j) - 'a']++;
            if(Arrays.equals(s2Freq, s1Freq)) {
                return true;
            }
        }
        return false;
    }
}
