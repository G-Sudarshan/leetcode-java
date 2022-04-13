class Solution {
    public int[][] generateMatrix(int n) {
        
    List<Integer> num=new ArrayList<Integer>();
        for(int x=1;x<=n*n;x++)
        {
           
            num.add(x);
        }
        int count=0;
        //i and j are to traverse the matrix
        int i=0;
        int j=0;
        //bi and bj are the respective beginning indices of i and j of the current spiral
        int bi=0;
        int bj=0;
        //li and lj are the respective ending indices of i and j of the current spiral
        int li=n-1;
        int lj=n-1;
        int[][] ans=new int[n][n];
        while(count<n*n-1)
        {
           
                while(j<lj)
                {

                    ans[i][j]=num.get(count);

                    count++;
                    j++;
                }

                lj--;
                while(i<li)
                {

                   ans[i][j]=num.get(count);

                    count++;
                    i++;
                }
                li--;
                bi++;
                while(j>bj)
                {

                   ans[i][j]=num.get(count);

                    count++;
                     j--;
                }
                bj++;


                while(i>bi)
                {

                    ans[i][j]=num.get(count);
                    count++;
                        i--;
                }

        }
       ans[i][j]=num.get(count);
        return ans;
        
    }
}