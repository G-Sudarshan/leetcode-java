class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++ ){
            if(isAlphaNumeric(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        s = sb.toString();
        int lo = 0, hi = s.length()-1;
        while(lo<hi){
            if(s.charAt(lo)!=s.charAt(hi)){
                return false;
            }
            lo++;
            hi--;
        }
        return true;
    }
               
    public boolean isAlphaNumeric(char ch){
       if(ch>=48 && ch<=57){
           return true;
       }else if(ch>=65 && ch<= 90){
           return true;
       }else if(ch>=97 && ch<=122){
           return true;
       }else{
           return false;
       }
    }
}