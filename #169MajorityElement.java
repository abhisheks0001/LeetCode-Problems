class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        for(int i =0 ; i<nums.length; i++) {
            count = 0;
            int curr = nums[i];
            for(int k = 0 ; k<nums.length;k++)
            if(curr == nums[k]) {
                count++;
                if(count >= nums.length/2 +1) {
                    return curr;
                }
            }
        }
        return -1;
    }
}