class Solution
{
    public int countTriples(int n)
    {
        int cnt=0;
        for(int a=1;a<n;a++)
        {
            for(int b=a+1;b<=n;b++)
            {
                int c=(int)(Math.sqrt((a*a)+(b*b)));
                if(c<=n && (a*a)+(b*b)==(c*c))
                {
                    cnt+=2;
                }
            }
        }
        return cnt;
    }
}
