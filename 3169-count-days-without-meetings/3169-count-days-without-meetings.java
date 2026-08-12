class Solution {
    public int countDays(int days, int[][] meetings) {
        
        int ans = 0;

        Arrays.sort((meetings), (a,b)->(a[0]-b[0]));

        int max = meetings[meetings.length-1][1];

        int maxi = meetings[0][1];

        for(int i = 0; i < meetings.length-1; i++) {

            int ele = meetings[i][1];
            int ele1 = meetings[i+1][0];

            max = Math.max(max, ele);

            maxi = Math.max(maxi, ele);

            if((ele1-maxi) > 0) ans += ele1-maxi-1;
        }

        ans += meetings[0][0]-1;
        ans += days-max;

        return ans;
    }
}