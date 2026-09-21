class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        int ans = 0;

        Arrays.sort(intervals, (a,b)->Integer.compare(a[1],b[1]));
        //Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));

        int check = intervals[0][1];

        for(int i = 1; i < intervals.length; i++) {

            if(check > intervals[i][0]) {
                ans++;
            }
            else check = intervals[i][1];
        }
        return ans;
    }
}