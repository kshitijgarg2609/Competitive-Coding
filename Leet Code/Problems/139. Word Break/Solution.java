class Solution
{
    public boolean wordBreak(String s, List<String> wordDict)
    {
        int max_len=0;
        Set<String> set = new HashSet<>();
        for(String word : wordDict)
        {
            max_len=Integer.max(max_len,word.length());
            set.add(word);
        }
        boolean dp[] = new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=s.length();i++)
        {
            for(int j=0;j<i && !dp[i];j++)
            {
                dp[i]=((i-j)<=max_len && dp[j] && set.contains(s.substring(j,i)));
            }
        }
        return dp[s.length()];
    }
}
