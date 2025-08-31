import java.util.*;
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i] >= nums[i+1]) {
            i--;
        }
        if(i>=0) {
            int j = n-1;
            while(nums[j]<= nums[i]) {
                j--;
            }
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];
        }
        for(int  k=i+1 , l = n-1 ; k<l ; k++,l--) {
                nums[k] = nums[k] + nums[l];
                nums[l] = nums[k] - nums[l];
                nums[k] = nums[k] - nums[l];
                
        }
        System.out.println(Arrays.toString(nums));
    }
}