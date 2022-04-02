class Solution {
        public boolean validPalindrome(String s) {
        return validPalindrome(s, true);
    }
    
    private boolean validPalindrome(String s, boolean canSkip) {
        int i = 0;
        int j = s.length() - 1;
        
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
                continue;
            }
            
            if (!canSkip) return false;
                
            if (i + 1 == j) return true;
                
            if (validPalindrome(subString(s, i + 1, j), false)) return true;
                
            if (validPalindrome(subString(s, i, j - 1), false)) return true;
                
            return false;
        }
        
        return true;
    }
    
    private String subString(String s, int i, int j) {
        StringBuilder sb = new StringBuilder();
        
        while (i <= j) {
            sb.append(s.charAt(i++));
        }
        
        return sb.toString();
    }
    
}