class Solution
{
    public int[][] transpose(int[][] matrix)
    {
        int r=matrix.length;
        int c=matrix[0].length;
        int arr[][] = new int[c][r];
        int ai=0;
        int aj=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[ai++][aj]=matrix[i][j];
                if(ai==c)
                {
                    ai=0;
                    aj++;
                }
            }
        }
        return arr;
    }
}
