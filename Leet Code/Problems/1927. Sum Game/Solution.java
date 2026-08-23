class Solution
{
    public boolean sumGame(String num)
    {
        int n=num.length();
        int q[] = new int[2];
        int sum[] = new int[2];
        for(int i=0;i<n;i++)
        {
            char c=num.charAt(i);
            int j=i<n/2?0:1;
            if(c=='?')
            {
                q[j]++;
            }
            else
            {
                sum[j]+=c-'0';
            }
        }
        return ((q[0]+q[1])%2)==1 || (sum[0]-sum[1])!=((q[1]-q[0])*9)/2;
    }
}
