class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int ans = 0;
        while (left < right) {
            int area = right - left;
            if (height[left] < height[right]) {
                area *= height[left++];
            } else {
                area *= height[right--];
            }
            
            ans = Math.max(ans, area);
        }
        return ans;
    }
}