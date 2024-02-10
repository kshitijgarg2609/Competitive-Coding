class Solution
{
    public int countSubstrings(String s)
    {
        int cnt=0;
        boolean dp[][] = new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++)
        {
            for(int j=0,k=i;k<s.length();j++,k++)
            {
                if(j==k || (s.charAt(j)==s.charAt(k) && (k-j==1 || dp[j+1][k-1])))
                {
                    dp[j][k]=true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
