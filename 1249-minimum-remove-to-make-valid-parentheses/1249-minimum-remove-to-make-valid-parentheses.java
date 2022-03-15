class Solution {
    public String minRemoveToMakeValid(String s) {
           Stack<Integer> st= new Stack<>();  //to check for valid parentheses
        char[] ch=s.toCharArray();   
        
    //this for loop make valid ch array and containing '.' you can use anything for flag
        for(int i=0;i<ch.length;i++){
            
            if(ch[i]=='('){
                st.push(i);
            }else if(ch[i] == ')'){
                if(st.size()==0){
                    ch[i]='.';
                }else
                    st.pop();
            }
            
                       
        }
        
        
        //remaining elements in stack
        while(st.size()>0){
            ch[st.pop()] ='.';
        }
        
        
        //store arrays ch int string for returning the valid string
        StringBuilder str = new StringBuilder();
        for(char c : ch){
            if(c!='.'){
                str.append(c);
            }
        }
        
        
        return str.toString();
    }
}