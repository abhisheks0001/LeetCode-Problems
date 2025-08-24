class Solution {
    public int singleNumber(int[] nums) {
        int size = nums.length;
        if(size==1) {
            return nums[0];
        }
        for(int i = 0 ; i < size ; i++) {
            int curr=  nums[i];
            int freq = 0;
            for(int j=0; j<size ; j++) {
                if(curr == nums[j]) {
                    freq++;
                }
            }
            if(freq==1) {
                    return curr;
                }
        }
        return 0;
    }
}