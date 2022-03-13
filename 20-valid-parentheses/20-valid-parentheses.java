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