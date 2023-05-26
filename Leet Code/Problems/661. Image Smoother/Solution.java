class Solution
{
    public int[][] imageSmoother(int[][] img)
    {
        int dir[][] = new int[][]{{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        int m=img.length;
        int n=img[0].length;
        int filter[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                filter[i][j]=img[i][j];
                int cnt=1;
                for(int d[] : dir)
                {
                    int x=i+d[0];
                    int y=j+d[1];
                    if(x>=0 && x<m && y>=0 && y<n)
                    {
                        filter[i][j]+=img[x][y];
                        cnt++;
                    }
                }
                filter[i][j]/=cnt;
            }
        }
        return filter;
    }
}
