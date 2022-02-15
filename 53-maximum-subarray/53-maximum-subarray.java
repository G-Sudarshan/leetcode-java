class Solution {
    public int maxSubArray(int[] nums) {
        int cur_max = 0;
        int max = Integer.MIN_VALUE;
        
        for(int n: nums){
            cur_max = Math.max(n, cur_max+n);
            max = Math.max(max, cur_max);
        }
        
        return max;
    }
        
}