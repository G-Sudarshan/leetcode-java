/*

344. Reverse String
Easy

3213

843

Add to List

Share
Write a function that reverses a string. The input string is given as an array of characters s.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 

Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.
 

Follow up: Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Accepted
1,238,286
Submissions
1,708,255

*/

class Solution {
    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length-1;
        char temp;
        
        while(low<high){
            temp = s[high];
            s[high] = s[low];
            s[low] = temp;
            low++;
            high--;
        }
    }
}
