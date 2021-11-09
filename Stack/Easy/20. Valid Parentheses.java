/*
20. Valid Parentheses
Easy

9697

381

Add to List

Share
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
Example 4:

Input: s = "([)]"
Output: false
Example 5:

Input: s = "{[]}"
Output: true
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
Accepted
1,750,090
Submissions
4,321,209
*/

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(' :
                    stk.push('(');
                    break;
                case '[' :
                    stk.push('[');
                    break;
                case '{' :
                    stk.push('{');
                    break;
                case ')' :
                    if (stk.empty() || stk.pop() != '('){
                        return false;
                    }
                    break;
                case ']' :
                    if (stk.empty() || stk.pop() != '['){
                        return false;
                    }
                    break;
                case '}' :
                    if (stk.empty() || stk.pop() != '{'){
                        return false;
                    }
                    break;
                default :
                    return false;                    
            }
            
            
        }
        if (stk.empty()) {
            return true;
        }
        return false;
        
    }
}
