class Solution {
    public long maxProduct(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        
        Arrays.sort(nums);

        int n = nums.length;

        int a = nums[n-3];
        int b = nums[n-2];
        int c = nums[n-1];

        int zcount = 0;

        if(a == 0) zcount++;
        if(b == 0) zcount++;
        if(c == 0) zcount++;

        if(zcount > 1) return 0;
        else {
            long mul = 1;
            if(zcount == 1) {
                if(a != 0) mul *= a;
                if(b != 0) mul *= b;
                if(c != 0) mul *= c;
            }
            else {
                mul *= b;
                mul *= c;
            }

            mul *= 100000;
            return mul;
        }
    }
}