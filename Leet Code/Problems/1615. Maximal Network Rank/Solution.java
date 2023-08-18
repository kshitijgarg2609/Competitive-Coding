class Solution
{
    public int maximalNetworkRank(int n, int[][] roads)
    {
        int cnt[] = new int[n];
        int edge[][] = new int[n][n];
        for(int r[] : roads)
        {
            cnt[r[0]]++;
            cnt[r[1]]++;
            edge[r[0]][r[1]]=edge[r[1]][r[0]]=1;
        }
        int rank=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                rank=Integer.max(rank,cnt[i]+cnt[j]-edge[i][j]);
            }
        }
        return rank;
    }
}
