class Solution
{
    public int[][] matrixReshape(int[][] mat, int r, int c)
    {
        int row=mat.length;
        int column=mat[0].length;
        if((row*column)!=(r*c))
        {
            return mat;
        }
        int ans[][] = new int[r][c];
        int i=0,j=0;
        for(int series[] : mat)
        {
            for(int x : series)
            {
                ans[i][j++]=x;
                if(j==c)
                {
                    i++;
                    j=0;
                }
            }
        }
        return ans;
    }
}
