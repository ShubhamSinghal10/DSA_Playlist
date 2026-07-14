class Solution {
    public boolean isMonotonic(int[] nums) {
        
        boolean neg = true;
        boolean pos = true;

        for(int i = 1; i < nums.length; i++) {

            if(nums[i-1] < nums[i]) {
                neg = false;
                break;
            }
        }

        for(int i = 1; i < nums.length; i++) {

            if(nums[i-1] > nums[i]) {
                pos = false;
                break;
            }
        }        
        
        if(neg || pos) return true;
        else return false;
    }
}