class Solution
{
    public int numberOfSubmatrices(char[][] grid)
    {
        int cnt=0;
        int colX[] = new int[grid[0].length];
        int colY[] = new int[grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int rowX=0,rowY=0,j=0;j<grid[0].length;j++)
            {
                colX[j]+=(grid[i][j]=='X')?1:0;
                colY[j]+=(grid[i][j]=='Y')?1:0;
                rowX+=colX[j];
                rowY+=colY[j];
                if(rowX==rowY && rowX>0 && rowY>0)
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
