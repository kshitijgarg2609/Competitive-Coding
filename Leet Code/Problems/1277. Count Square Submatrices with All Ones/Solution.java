class Solution
{
    public int countSquares(int[][] matrix)
    {
        int sum=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i==0 || j==0 || matrix[i][j]==0)
                {
                    sum+=matrix[i][j];
                    continue;
                }
                if(matrix[i][j]!=0)
                {
                    sum+=(matrix[i][j]=IntStream.of(matrix[i-1][j],matrix[i-1][j-1],matrix[i][j-1]).min().getAsInt()+1);
                }
            }
        }
        return sum;
    }
}
