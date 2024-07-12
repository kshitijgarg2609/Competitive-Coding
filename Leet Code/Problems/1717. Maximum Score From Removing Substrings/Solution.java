class Solution
{
    public int maximumGain(String s, int x, int y)
    {
        if(x<y)
        {
            return maximumGain(new StringBuilder(s).reverse().toString(),y,x);
        }
        int cnt=0,a=0,b=0;
        for(char c : s.toCharArray())
        {
            if(c=='a')
            {
                a++;
            }
            else if(c=='b')
            {
                if(a>0)
                {
                    a--;
                    cnt+=x;
                }
                else
                {
                    b++;
                }
            }
            else
            {
                cnt+=(Integer.min(a,b)*y);
                a=b=0;
            }
        }
        cnt+=(Integer.min(a,b)*y);
        return cnt;
    }
}
