class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxwater = 0;
        while(left<right) {
            int width = right -left;
            int waterlevel = Math.min(height[left], height[right]);
            int trappedwater = width * waterlevel;
            maxwater = Math.max(maxwater ,trappedwater );
            if(height[left] < height[right]) {
                left++;
            } else {
                right --;
            }
        }
        return maxwater;
    }
} 