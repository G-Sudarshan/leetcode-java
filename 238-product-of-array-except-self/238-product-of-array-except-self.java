class Solution {
    public int[] productExceptSelf(int[] nums) {        
            int n = nums.length;

            int[] res = new int[n];

            for(int i =0 ; i < n; i++){
                res[i] = 1;
            }

            int left = 1, right = 1;

            for(int i=0; i < n ; i++){
                res[i] = res[i] * left;
                left = left * nums[i];

                res[n-1-i] = res[n-1-i] * right;
                right = right * nums[n-1-i];
            }

            return res; 
            
            
        
    }
}