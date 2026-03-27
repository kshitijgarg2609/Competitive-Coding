class Solution
{
    public boolean areSimilar(int[][] mat, int k)
    {
        k=k%mat[0].length;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]!=mat[i][(j+mat[0].length+(i%2==0?-k:k))%mat[0].length])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
