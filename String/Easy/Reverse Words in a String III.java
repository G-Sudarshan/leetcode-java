/*

557. Reverse Words in a String III
Easy

1951

123

Add to List

Share
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"
 

Constraints:

1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.
Accepted
319,923
Submissions
424,341

*/

class Solution {
    public String reverseWords(String s) {
       String[] words = s.split(" ");
       StringBuilder temp = new StringBuilder();
        
        for(String word: words){
            char[] w = word.toCharArray();
            reverseString(w);
            word = String.valueOf(w);
            temp.append(" ");
            temp.append(word);
        }
        temp.deleteCharAt(0); // to delete first whitespace
        String res = temp.toString();
        
        return res;
    }
    
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
