class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] right = new int[n];
        int[] left = new int[n];
        //int[] water = new int[n];
        int res = 0;
        
        left[0] = height[0];
        
        for(int i=1; i<n; i++){
            left[i] = Math.max(height[i], left[i-1]);
        }
        
        right[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            right[i] =  Math.max(height[i], right[i+1]);
        }
        
        for(int i=1; i<n-1; i++){
            //water[i] = 
            res += Math.min(left[i], right[i]) - height[i];
        }
        
        // for(int i=0; i<n; i++){
        //     res += water[i];
        // }
        
        return res;
        
    }
}