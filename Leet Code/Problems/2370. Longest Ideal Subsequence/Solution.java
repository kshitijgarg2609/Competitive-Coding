class Solution
{
    public int longestIdealString(String s, int k)
    {
        int max=0;
        int dp[] = new int[26];
        for(char c : s.toCharArray())
        {
            dp[c-'a']=Integer.max(dp[c-'a'],1+IntStream.range(0,26).filter(i->Math.abs(c-'a'-i)<=k).map(i->dp[i]).max().getAsInt());
            max=Integer.max(max,dp[c-'a']);
        }
        return max;
    }
}
