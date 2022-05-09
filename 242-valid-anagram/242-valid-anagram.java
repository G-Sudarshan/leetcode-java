class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for(char ch: s.toCharArray()){
            count[ch-'a'] += 1;
        }
        
        for(char ch: t.toCharArray()){
            count[ch-'a'] -= 1;
        }
        
        for(int x: count){
            if(x!=0)
                return false;
        }
        return true;
    }
}