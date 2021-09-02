/*

1304. Find N Unique Integers Sum up to Zero
Easy

720

369

Add to List

Share
Given an integer n, return any array containing n unique integers such that they add up to 0.

 

Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]
 

Constraints:

1 <= n <= 1000
Accepted
100,543
Submissions
131,223

*/

class Solution {
     public int[] sumZero(int n) {
        int [] a=new int [n]; //creating a new array
			if(n%2!=0){   //for odd numbers
            int x=(n-1)/2;   
            for(int i=0;i<n;i++){
                a[i]=-1*x;
                x=-1*(a[i]+1);
            }
           
        }
    else{
        int x=n/2;  //for even numbers
        for(int i=0;i<n;i++){
            a[i]=x;
            if(a[i]<=0){
                a[i]=a[i]-1;
            }
            x=x-1;
        
       }
        
        
    }
        return a;
}
}
