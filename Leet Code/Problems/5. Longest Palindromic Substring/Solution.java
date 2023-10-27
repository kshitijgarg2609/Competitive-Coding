class Solution
{
    public String longestPalindrome(String s)
    {
        boolean dp[][] = new boolean[s.length()][s.length()];
        int indx[] = new int[]{0,0};
        for(int d=0;d<s.length();d++)
        {
            for(int i=0,j=i+d;j<s.length();i++,j++)
            {
                if(s.charAt(i)==s.charAt(j) && ((j-i)<=1 || dp[i+1][j-1]))
                {
                    dp[i][j]=true;
                    if((j-i)>(indx[1]-indx[0]))
                    {
                        indx=new int[]{i,j};
                    }
                }
            }
        }
        return s.substring(indx[0],indx[1]+1);
    }
}
