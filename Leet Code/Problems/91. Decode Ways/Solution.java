class Solution
{
    public int numDecodings(String s)
    {
        int dp[] = new int[s.length()+1];
        dp[0]=1;
        dp[1]=s.charAt(0)=='0'?0:1;
        for(int i=2;i<=s.length();i++)
        {
            int single_digit = Integer.parseInt(s.substring(i-1,i));
            int double_digit = Integer.parseInt(s.substring(i-2,i));
            if(single_digit>=1 && single_digit<=9)
            {
                dp[i]+=dp[i-1];
            }
            if(double_digit>=10 && double_digit<=26)
            {
                dp[i]+=dp[i-2];
            }
        }
        return dp[s.length()];
    }
}
