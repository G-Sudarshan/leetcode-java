class Solution {
    public int maxSubArray(int[] nums) {
        int cur_max = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++){
            cur_max = Math.max(nums[i], cur_max + nums[i]);
            if(cur_max>max)
                max = cur_max;
        }
        
        return max;
    }
        
}