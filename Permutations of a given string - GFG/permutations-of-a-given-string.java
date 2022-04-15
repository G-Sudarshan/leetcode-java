// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}

// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        List<String> res = new ArrayList<String>();
        
        getAllPerm(S, res, "");
        
        Collections.sort(res);
        
        return res;
        
    }
    
    public void getAllPerm(String str, List<String> res, String ans){
        if(str.length() == 0){
            res.add(ans);
            return;
        }
        
        for(int i=0; i<str.length(); i++ ){
            char ch = str.charAt(i);

			String mod_str = str.substring(0, i) + str.substring(i + 1);

			getAllPerm(mod_str, res, ans + ch);
        }
    }
}