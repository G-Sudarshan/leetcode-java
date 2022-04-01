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