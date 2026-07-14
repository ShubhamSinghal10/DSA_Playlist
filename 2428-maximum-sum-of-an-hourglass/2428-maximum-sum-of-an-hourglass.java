class Solution {
    public int maxSum(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;

        int[][] pre = new int[n][m];

        for(int i = 0; i < n; i++) pre[i][0] = grid[i][0];

        for(int i = 0; i < n; i++) {
            for(int j = 1; j < m; j++) {
                pre[i][j] = pre[i][j-1]+grid[i][j];
            }
        }

        int ans = 0;

        for(int i = 0; i < n-2; i++) {
            for(int j = 0; j < m-2; j++) {
                int count = 0;
                if(j == 0) {
                    count += pre[i][j+2];
                    count += pre[i+2][j+2];           
                }
                else {
                    count += pre[i][j+2]-pre[i][j-1];
                    count += pre[i+2][j+2]-pre[i+2][j-1];
                }

                count += (pre[i+1][j+1]-pre[i+1][j]);
                ans = Math.max(count, ans);
            }          
        }
        return ans;
    }
}