class Solution
{
    public int getMaximumGold(int[][] grid)
    {
        int gold=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                gold=Integer.max(gold,getMaximumGold(grid,new boolean[grid.length][grid[0].length],new int[]{i,j}));
            }
        }
        return gold;
    }
    int getMaximumGold(int grid[][], boolean vis[][],int pnt[])
    {
        int gold=0;
        if(pnt[0]>=0 && pnt[0]<grid.length && pnt[1]>=0 && pnt[1]<grid[0].length && grid[pnt[0]][pnt[1]]!=0 && !vis[pnt[0]][pnt[1]])
        {
            vis[pnt[0]][pnt[1]]=true;
            for(int d[] : new int[][]{{0,-1},{0,1},{-1,0},{1,0}})
            {
                gold=Integer.max(gold,grid[pnt[0]][pnt[1]]+getMaximumGold(grid,vis,new int[]{pnt[0]+d[0],pnt[1]+d[1]}));
            }
            vis[pnt[0]][pnt[1]]=false;
        }
        return gold;
    }
}
