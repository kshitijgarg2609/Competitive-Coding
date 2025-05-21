class Solution
{
    public void setZeroes(int[][] matrix)
    {
        boolean row[] = new boolean[matrix.length];
        boolean col[] = new boolean[matrix[0].length];
        Queue<int[]> qu = new LinkedList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                row[i]=row[i]||matrix[i][j]==0;
                col[j]=col[j]||matrix[i][j]==0;
            }
        }
        IntStream.range(0,matrix.length).filter(r->row[r]).forEach(r->{for(int c=0;c<matrix[0].length;matrix[r][c++]=0);});
        IntStream.range(0,matrix[0].length).filter(c->col[c]).forEach(c->{for(int r=0;r<matrix.length;matrix[r++][c]=0);});
    }
}
