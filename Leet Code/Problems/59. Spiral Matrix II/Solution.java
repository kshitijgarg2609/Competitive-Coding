class Solution
{
    public int[][] generateMatrix(int n)
    {
        int dir[][] = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        int d=0;
        int matrix[][] = new int[n][n];
        int i=0;
        int j=0;
        for(int k=1;k<=(n*n);k++)
        {
            matrix[i][j]=k;
            if((i+dir[d][0])>=0 && (i+dir[d][0])<n && (j+dir[d][1])>=0 && (j+dir[d][1])<n && matrix[i+dir[d][0]][j+dir[d][1]]==0)
            {
                i+=dir[d][0];
                j+=dir[d][1];
            }
            else
            {
                d=(d+1)%4;
                i+=dir[d][0];
                j+=dir[d][1];
            }
        }
        return matrix;
    }
}
