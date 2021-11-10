/*

You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

 

Example 1:

Input: s = "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
Example 2:

Input: s = "azxxzy"
Output: "ay"
 

Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
Accepted
221,865
Submissions
311,765

*/

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<Character>();
        char ch;
        
        for(int i=0; i < s.length() ; i++){
            if(!stk.empty() && stk.peek()==s.charAt(i)){
                stk.pop();
                
            }else{
            stk.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        
        while(!stk.empty()){
            ch = stk.pop();
            sb.append(ch);
        }
        sb.reverse();
        s = sb.toString();
        return s;
    }
}
