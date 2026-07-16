class Solution {
    public long gcdSum(int[] nums) {
        
        long maxi = nums[0];

        long[] ans = new long[nums.length];

        for(int i = 0; i < nums.length; i++) {

            maxi = Math.max(maxi, nums[i]);

            ans[i] = gcd(maxi, nums[i]);
        }

        Arrays.sort(ans);

        long ya = 0;

        int i = 0;
        int j = nums.length-1;

        while(i < j) {

            ya += gcd(ans[i], ans[j]);
            i++;
            j--;
        }

        return ya;
    }

    public static long gcd(long a, long b) {

        while (b != 0) { long temp = b; b = a % b; a = temp; } return a;
    }
}