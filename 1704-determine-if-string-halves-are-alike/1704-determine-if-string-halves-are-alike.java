class Solution {
    public boolean halvesAreAlike(String s) {
        int str1Count = getNumberOfVowels(s.substring(0,(s.length()/2)));
        int str2Count = getNumberOfVowels(s.substring((s.length()/2),s.length()));
                                          
        return str1Count == str2Count;
    }
    
    public int getNumberOfVowels(String s){
        int count = 0;
        for(char ch: s.toCharArray()){
            switch(ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    count++;
                break;
                default: break; 
            }
        }
        return count;
    }
}