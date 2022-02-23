class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] right = new int[n];
        int[] left = new int[n];
        int[] water = new int[n];
        int res = 0;
        
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            max = Math.max(height[i], max);
            left[i] = max;
        }
        
        max = Integer.MIN_VALUE;
        
        for(int i=n-1; i>=0; i--){
            max = Math.max(height[i], max);
            right[i] = max;
        }
        
        for(int i=1; i<n-1; i++){
            water[i] = Math.min(left[i], right[i]) - height[i];
        }
        
        for(int i=0; i<n; i++){
            res += water[i];
        }
        
        return res;
        
    }
}