class Solution {
    public int projectionArea(int[][] grid) {
        
        int top = 0;
        int front = 0;
        int side = 0;

        for(int i = 0; i < grid.length; i++) {

            int row = 0;
            int col = 0;

            for(int j = 0; j < grid[0].length; j++) {

                int ele = grid[i][j];

                if(ele > 0) top++;

                row = Math.max(row, ele);
                col = Math.max(col, grid[j][i]);
            }

            front += row;
            side += col;
        }

        return top + front + side;
    }
}