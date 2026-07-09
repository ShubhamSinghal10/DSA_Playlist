class Solution {
    public int maximumPrimeDifference(int[] nums) {
        
        int i = 0;
        int j = nums.length-1;

        while(i < j) {

            boolean first = primeCheck(nums[i]); 
            boolean last = primeCheck(nums[j]);

            if(first) {
                if(last) return j-i;
            }
            
            if(!first) i++;
            if(!last) j--;
        }
        return 0;
    }

    public boolean primeCheck(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}