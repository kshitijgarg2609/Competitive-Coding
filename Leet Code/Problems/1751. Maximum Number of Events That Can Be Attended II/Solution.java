class Solution
{
    public int maxValue(int[][] events, int k)
    {
        int dp[][] = new int[k+1][events.length+1];
        Arrays.sort(events,(a,b)->(a[0]!=b[0])?Integer.compare(a[0],b[0]):Integer.compare(a[1],b[1]));
        for(int i=events.length-1;i>=0;i--)
        {
            for(int j=1;j<=k;j++)
            {
                int indx=Arrays.binarySearch(events,new int[]{events[i][1],0},(a,b)->(a[0]==b[0])?-1:Integer.compare(a[0],b[0]));
                dp[j][i]=Integer.max(dp[j][i+1],events[i][2]+dp[j-1][indx>=0?indx:(-indx-1)]);
            }
        }
        return dp[k][0];
    }
}
