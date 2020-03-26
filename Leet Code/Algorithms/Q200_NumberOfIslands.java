/*
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. 
An island is surrounded by water and is formed 
by connecting adjacent lands horizontally or vertically. 
You may assume all four edges of the grid are all surrounded by water.

Example 1:
Input:
11110
11010
11000
00000

Output: 1


Example 2:
Input:
11000
11000
00100
00011
Output: 3
 */


class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid == null){
            return 0;
        }
        
        int count = 0;
        int row = grid.length;
        int column = grid[0].length;
        
        for(int r = 0; r < row; r++){
            for(int c = 0; c < column; c++){
                if(grid[r][c] == '1'){
                    count++;
                    dfs(grid, r, c);
                }
            }
        }
                
        return count;
    }
    
    void dfs(char[][] grid, int row, int column){
        int r = grid.length;
        int c = grid[0].length;
        
        if(row < 0 || column < 0 || row >= r || column >= c || (grid[row][column] == '0')){
            return;
        }
            
        grid[row][column] = '0';
        dfs(grid, row - 1, column);
        dfs(grid, row + 1, column);
        dfs(grid, row, column - 1);
        dfs(grid, row, column + 1);
    }
}