class Solution
{
    public int minimumTotal(List<List<Integer>> triangle)
    {
        int dp[] = new int[]{triangle.get(0).get(0)};
        for(int r=1;r<triangle.size();r++)
        {
            int nxt[] = new int[r+1];
            Arrays.fill(nxt,Integer.MAX_VALUE);
            for(int c=0;c<dp.length;c++)
            {
                nxt[c]=Integer.min(nxt[c],dp[c]+triangle.get(r).get(c));
                nxt[c+1]=Integer.min(nxt[c+1],dp[c]+triangle.get(r).get(c+1));
            }
            dp=nxt;
        }
        return Arrays.stream(dp).min().getAsInt();
    }
}
